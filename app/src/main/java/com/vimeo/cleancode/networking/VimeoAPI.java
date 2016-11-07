package com.vimeo.cleancode.networking;

import com.vimeo.cleancode.models.ChannelVideosResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Brandon on 11/6/16.
 */

public interface VimeoAPI {
    //The api for pull back staffpicks
    @GET("channels/{channel}/videos")
    Observable<ChannelVideosResponse> getChannelVideos(@Path("channel") String channel, @Query("page") int page);
}
