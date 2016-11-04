
package com.vimeo.cleancode.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Feed {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("options")
    @Expose
    private List<String> options = new ArrayList<String>();

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
     *     The options
     */
    public List<String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(List<String> options) {
        this.options = options;
    }

}
