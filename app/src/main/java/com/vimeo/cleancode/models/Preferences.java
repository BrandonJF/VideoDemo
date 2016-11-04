
package com.vimeo.cleancode.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Preferences {

    @SerializedName("videos")
    @Expose
    private Videos_ videos;

    /**
     * 
     * @return
     *     The videos
     */
    public Videos_ getVideos() {
        return videos;
    }

    /**
     * 
     * @param videos
     *     The videos
     */
    public void setVideos(Videos_ videos) {
        this.videos = videos;
    }

}
