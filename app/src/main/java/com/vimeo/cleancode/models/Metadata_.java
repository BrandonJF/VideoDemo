
package com.vimeo.cleancode.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata_ {

    @SerializedName("connections")
    @Expose
    private Connections_ connections;

    /**
     * 
     * @return
     *     The connections
     */
    public Connections_ getConnections() {
        return connections;
    }

    /**
     * 
     * @param connections
     *     The connections
     */
    public void setConnections(Connections_ connections) {
        this.connections = connections;
    }

}
