
package com.vimeo.cleancode.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Connections {

    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("credits")
    @Expose
    private Credits credits;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("pictures")
    @Expose
    private Pictures_ pictures;
    @SerializedName("texttracks")
    @Expose
    private Texttracks texttracks;
    @SerializedName("related")
    @Expose
    private Related related;

    /**
     * 
     * @return
     *     The comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The credits
     */
    public Credits getCredits() {
        return credits;
    }

    /**
     * 
     * @param credits
     *     The credits
     */
    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The pictures
     */
    public Pictures_ getPictures() {
        return pictures;
    }

    /**
     * 
     * @param pictures
     *     The pictures
     */
    public void setPictures(Pictures_ pictures) {
        this.pictures = pictures;
    }

    /**
     * 
     * @return
     *     The texttracks
     */
    public Texttracks getTexttracks() {
        return texttracks;
    }

    /**
     * 
     * @param texttracks
     *     The texttracks
     */
    public void setTexttracks(Texttracks texttracks) {
        this.texttracks = texttracks;
    }

    /**
     * 
     * @return
     *     The related
     */
    public Related getRelated() {
        return related;
    }

    /**
     * 
     * @param related
     *     The related
     */
    public void setRelated(Related related) {
        this.related = related;
    }

}
