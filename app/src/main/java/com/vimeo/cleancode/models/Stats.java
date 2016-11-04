
package com.vimeo.cleancode.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Stats {

    @SerializedName("plays")
    @Expose
    private Integer plays;

    /**
     * 
     * @return
     *     The plays
     */
    public Integer getPlays() {
        return plays;
    }

    /**
     * 
     * @param plays
     *     The plays
     */
    public void setPlays(Integer plays) {
        this.plays = plays;
    }

}
