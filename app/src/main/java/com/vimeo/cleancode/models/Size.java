
package com.vimeo.cleancode.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Size {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("link_with_play_button")
    @Expose
    private String linkWithPlayButton;

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The linkWithPlayButton
     */
    public String getLinkWithPlayButton() {
        return linkWithPlayButton;
    }

    /**
     * 
     * @param linkWithPlayButton
     *     The link_with_play_button
     */
    public void setLinkWithPlayButton(String linkWithPlayButton) {
        this.linkWithPlayButton = linkWithPlayButton;
    }

}
