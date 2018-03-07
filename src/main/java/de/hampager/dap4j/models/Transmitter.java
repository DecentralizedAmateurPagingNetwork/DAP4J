package de.hampager.dap4j.models;

import java.util.List;

public class Transmitter {

    private String name;
    private String longitude;
    private String latitude;
    private String power;
    private String nodeName;
    private Address address;
    private String timeSlot;
    private List<String> ownerNames;
    private String deviceType;
    private String status;

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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transmitter(String name, String longitude, String latitude, String power, String nodeName, Address address, String timeSlot, List<String> ownerNames, String deviceType, String status) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.power = power;
        this.nodeName = nodeName;
        this.address = address;
        this.timeSlot = timeSlot;
        this.ownerNames = ownerNames;
        this.deviceType = deviceType;
        this.status = status;
    }

    public Transmitter(String name, String longitude, String latitude, String power, String nodeName, String timeSlot, List<String> ownerNames, String deviceType, String status) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.power = power;
        this.nodeName = nodeName;
        this.timeSlot = timeSlot;
        this.ownerNames = ownerNames;
        this.deviceType = deviceType;
        this.status = status;
    }

    public Transmitter(String name, String longitude, String latitude, String power, String nodeName, Address address, String timeSlot, List<String> ownerNames, String deviceType) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.power = power;
        this.nodeName = nodeName;
        this.address = address;
        this.timeSlot = timeSlot;
        this.ownerNames = ownerNames;
        this.deviceType = deviceType;
    }
}
