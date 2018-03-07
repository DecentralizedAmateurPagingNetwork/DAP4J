package de.dap4j.hampager.models;

public class Node {

    private String name;
    private String longitude;
    private String latitude;
    private Address address;
    private String status;
    private String key;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node(String name, String longitude, String latitude, Address address, String status, String key) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.status = status;
        this.key = key;
    }

    public Node(String name, String longitude, String latitude, String status, String key) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.status = status;
        this.key = key;
    }

    public Node(String name, String longitude, String latitude, String status) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.status = status;
    }
}
