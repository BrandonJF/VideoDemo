
package com.vimeo.cleancode.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("language")
    @Expose
    private Object language;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("embed")
    @Expose
    private Embed embed;
    @SerializedName("created_time")
    @Expose
    private String createdTime;
    @SerializedName("modified_time")
    @Expose
    private String modifiedTime;
    @SerializedName("release_time")
    @Expose
    private String releaseTime;
    @SerializedName("content_rating")
    @Expose
    private List<String> contentRating = new ArrayList<String>();
    @SerializedName("license")
    @Expose
    private Object license;
    @SerializedName("privacy")
    @Expose
    private Privacy privacy;
    @SerializedName("pictures")
    @Expose
    private Pictures pictures;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("app")
    @Expose
    private Object app;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("resource_key")
    @Expose
    private String resourceKey;
    @SerializedName("embed_presets")
    @Expose
    private Object embedPresets;

    /**
     * 
     * @return
     *     The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
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
     *     The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

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
     *     The language
     */
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Object language) {
        this.language = language;
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
     *     The embed
     */
    public Embed getEmbed() {
        return embed;
    }

    /**
     * 
     * @param embed
     *     The embed
     */
    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    /**
     * 
     * @return
     *     The createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 
     * @param createdTime
     *     The created_time
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 
     * @return
     *     The modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 
     * @param modifiedTime
     *     The modified_time
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * 
     * @return
     *     The releaseTime
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    /**
     * 
     * @param releaseTime
     *     The release_time
     */
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * 
     * @return
     *     The contentRating
     */
    public List<String> getContentRating() {
        return contentRating;
    }

    /**
     * 
     * @param contentRating
     *     The content_rating
     */
    public void setContentRating(List<String> contentRating) {
        this.contentRating = contentRating;
    }

    /**
     * 
     * @return
     *     The license
     */
    public Object getLicense() {
        return license;
    }

    /**
     * 
     * @param license
     *     The license
     */
    public void setLicense(Object license) {
        this.license = license;
    }

    /**
     * 
     * @return
     *     The privacy
     */
    public Privacy getPrivacy() {
        return privacy;
    }

    /**
     * 
     * @param privacy
     *     The privacy
     */
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    /**
     * 
     * @return
     *     The pictures
     */
    public Pictures getPictures() {
        return pictures;
    }

    /**
     * 
     * @param pictures
     *     The pictures
     */
    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The app
     */
    public Object getApp() {
        return app;
    }

    /**
     * 
     * @param app
     *     The app
     */
    public void setApp(Object app) {
        this.app = app;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The resourceKey
     */
    public String getResourceKey() {
        return resourceKey;
    }

    /**
     * 
     * @param resourceKey
     *     The resource_key
     */
    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * 
     * @return
     *     The embedPresets
     */
    public Object getEmbedPresets() {
        return embedPresets;
    }

    /**
     * 
     * @param embedPresets
     *     The embed_presets
     */
    public void setEmbedPresets(Object embedPresets) {
        this.embedPresets = embedPresets;
    }

}
