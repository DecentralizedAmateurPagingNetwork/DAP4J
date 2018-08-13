package de.hampager.dap4j.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Node implements Serializable {

    private final static long serialVersionUID = -3114154057211851627L;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("ownerNames")
    @Expose
    private List<String> ownerNames = null;
    @SerializedName("version")
    @Expose
    private Object version;

    /**
     * No args constructor for use in serialization
     */
    public Node() {
    }

    /**
     * @param status
     * @param address
     * @param name
     * @param longitude
     * @param latitude
     * @param ownerNames
     * @param version
     */
    public Node(String name, String longitude, String latitude, Object address, String status, List<String> ownerNames, Object version) {
        super();
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.status = status;
        this.ownerNames = ownerNames;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }


}