
package com.vimeo.cleancode.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Videos_ {

    @SerializedName("privacy")
    @Expose
    private Object privacy;

    /**
     * 
     * @return
     *     The privacy
     */
    public Object getPrivacy() {
        return privacy;
    }

    /**
     * 
     * @param privacy
     *     The privacy
     */
    public void setPrivacy(Object privacy) {
        this.privacy = privacy;
    }

}
