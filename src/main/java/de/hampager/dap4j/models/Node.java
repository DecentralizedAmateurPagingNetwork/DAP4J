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
    private Address address;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("ownerNames")
    @Expose
    private List<String> ownerNames = null;
    @SerializedName("version")
    @Expose
    private String version;

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
    public Node(String name, String longitude, String latitude, Address address, String status, List<String> ownerNames, String version) {
        super();
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.status = status;
        this.ownerNames = ownerNames;
        this.version = version;
    }

    /**
     * @param status
     * @param ipaddr
     * @param port
     * @param name
     * @param longitude
     * @param latitude
     * @param ownerNames
     * @param version
     */
    public Node(String name, String longitude, String latitude, String ipaddr, int port, String status, List<String> ownerNames, String version) {
        super();
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = new Address(ipaddr, port);
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}