package com.vimeo.cleancode.networking;

import com.vimeo.cleancode.CleanApp;
import com.vimeo.cleancode.events.LoadingEvent;
import com.vimeo.cleancode.models.ChannelVideosResponse;

import rx.Observable;

/**
 * Created by Brandon on 11/6/16.
 */

public class VimeoAPIService {

    private static VimeoAPIService mInstance;

    private VimeoAPI mAPI;
    private boolean isRequestingVideos;


    private VimeoAPIService() {
        this.mAPI = CleanApp.getInstance().getRetrofit().create(VimeoAPI.class);
    }

    public static synchronized VimeoAPIService getInstance() {
        if (mInstance == null) {
            mInstance = new VimeoAPIService();
        }
        return mInstance;
    }



    public Observable<ChannelVideosResponse> getStaffPicks(int page) {
        return mAPI.getChannelVideos("staffpicks", page)
                .doOnSubscribe(() -> setRequestState(true))
                .doOnTerminate(() -> setRequestState(false))
                .doOnError(this::handleVideoAPIError);
    }

    private void setRequestState(boolean isRequesting) {
        isRequestingVideos = isRequesting;
    }

    private void handleVideoAPIError(Throwable throwable) {
        throw new IllegalArgumentException();
    }
}
