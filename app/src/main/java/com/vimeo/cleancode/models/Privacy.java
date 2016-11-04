
package com.vimeo.cleancode.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Privacy {

    @SerializedName("view")
    @Expose
    private String view;
    @SerializedName("embed")
    @Expose
    private String embed;
    @SerializedName("download")
    @Expose
    private Boolean download;
    @SerializedName("add")
    @Expose
    private Boolean add;
    @SerializedName("comments")
    @Expose
    private String comments;

    /**
     * 
     * @return
     *     The view
     */
    public String getView() {
        return view;
    }

    /**
     * 
     * @param view
     *     The view
     */
    public void setView(String view) {
        this.view = view;
    }

    /**
     * 
     * @return
     *     The embed
     */
    public String getEmbed() {
        return embed;
    }

    /**
     * 
     * @param embed
     *     The embed
     */
    public void setEmbed(String embed) {
        this.embed = embed;
    }

    /**
     * 
     * @return
     *     The download
     */
    public Boolean getDownload() {
        return download;
    }

    /**
     * 
     * @param download
     *     The download
     */
    public void setDownload(Boolean download) {
        this.download = download;
    }

    /**
     * 
     * @return
     *     The add
     */
    public Boolean getAdd() {
        return add;
    }

    /**
     * 
     * @param add
     *     The add
     */
    public void setAdd(Boolean add) {
        this.add = add;
    }

    /**
     * 
     * @return
     *     The comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

}
