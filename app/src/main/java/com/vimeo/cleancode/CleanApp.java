package com.vimeo.cleancode;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Brandon on 11/6/16.
 */

public class CleanApp extends Application {

    private Retrofit mRetrofit;
    private final String BASE_URL = "https://api.vimeo.com/";
    private static CleanApp mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Fresco.initialize(this);
        setupRetrofit();
    }

    public static synchronized CleanApp getInstance() {
        return mInstance;
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    public void setupRetrofit() {

        String url = "https://api.vimeo.com/channels/staffpicks/videos";
        final String token = "bearer b8e31bd89ba1ee093dc6ab0f863db1bd";

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                okhttp3.Request original = chain.request();
                okhttp3.Request request = original.newBuilder()
                        .header("Authorization", token)
                        .method(original.method(), original.body())
                        .build();
                return chain.proceed(request);
            }
        });

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }

        OkHttpClient client = httpClient.build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }
}
