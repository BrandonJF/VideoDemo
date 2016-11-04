
package com.vimeo.cleancode.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("connections")
    @Expose
    private Connections connections;

    /**
     * 
     * @return
     *     The connections
     */
    public Connections getConnections() {
        return connections;
    }

    /**
     * 
     * @param connections
     *     The connections
     */
    public void setConnections(Connections connections) {
        this.connections = connections;
    }

}
