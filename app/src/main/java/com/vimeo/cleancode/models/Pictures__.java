
package com.vimeo.cleancode.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Pictures__ {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sizes")
    @Expose
    private List<Size_> sizes = new ArrayList<Size_>();
    @SerializedName("resource_key")
    @Expose
    private String resourceKey;

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
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public List<Size_> getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(List<Size_> sizes) {
        this.sizes = sizes;
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

}
