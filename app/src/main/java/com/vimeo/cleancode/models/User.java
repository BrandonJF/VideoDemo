
package com.vimeo.cleancode.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("created_time")
    @Expose
    private String createdTime;
    @SerializedName("account")
    @Expose
    private String account;
    @SerializedName("pictures")
    @Expose
    private Pictures__ pictures;
    @SerializedName("websites")
    @Expose
    private List<Object> websites = new ArrayList<Object>();
    @SerializedName("metadata")
    @Expose
    private Metadata_ metadata;
    @SerializedName("resource_key")
    @Expose
    private String resourceKey;
    @SerializedName("preferences")
    @Expose
    private Preferences preferences;

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
     *     The location
     */
    public Object getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Object location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
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
     *     The account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 
     * @param account
     *     The account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 
     * @return
     *     The pictures
     */
    public Pictures__ getPictures() {
        return pictures;
    }

    /**
     * 
     * @param pictures
     *     The pictures
     */
    public void setPictures(Pictures__ pictures) {
        this.pictures = pictures;
    }

    /**
     * 
     * @return
     *     The websites
     */
    public List<Object> getWebsites() {
        return websites;
    }

    /**
     * 
     * @param websites
     *     The websites
     */
    public void setWebsites(List<Object> websites) {
        this.websites = websites;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata_ getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata_ metadata) {
        this.metadata = metadata;
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
     *     The preferences
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * 
     * @param preferences
     *     The preferences
     */
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

}
