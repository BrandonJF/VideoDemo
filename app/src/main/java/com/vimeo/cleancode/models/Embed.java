
package com.vimeo.cleancode.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Embed {

    @SerializedName("html")
    @Expose
    private String html;

    /**
     * 
     * @return
     *     The html
     */
    public String getHtml() {
        return html;
    }

    /**
     * 
     * @param html
     *     The html
     */
    public void setHtml(String html) {
        this.html = html;
    }

}
