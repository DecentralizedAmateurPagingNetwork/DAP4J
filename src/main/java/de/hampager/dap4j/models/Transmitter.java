package de.hampager.dap4j.models;

import java.util.List;

public class Transmitter {
    private String name;
    private String authKey;
    private double longitude;
    private double latitude;
    private double power;
    private String nodeName;
    private Address address;
    private String timeSlot;
    private List<String> ownerNames = null;
    private String deviceType;
    private String deviceVersion;
    private Integer callCount;
    private String status;
    private Integer antennaAboveGroundLevel;
    private String antennaType;
    private Integer antennaDirection;
    private float antennaGainDbi;
    private String lastUpdate;
    private String usage;
    private Integer identificationAddress;
    private String lastConnected;
    private String connectedSince;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
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

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public Integer getCallCount() {
        return callCount;
    }

    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAntennaAboveGroundLevel() {
        return antennaAboveGroundLevel;
    }

    public void setAntennaAboveGroundLevel(Integer antennaAboveGroundLevel) {
        this.antennaAboveGroundLevel = antennaAboveGroundLevel;
    }

    public String getAntennaType() {
        return antennaType;
    }

    public void setAntennaType(String antennaType) {
        this.antennaType = antennaType;
    }

    public Integer getAntennaDirection() {
        return antennaDirection;
    }

    public void setAntennaDirection(Integer antennaDirection) {
        this.antennaDirection = antennaDirection;
    }

    public double getAntennaGainDbi() {
        return antennaGainDbi;
    }

    public void setAntennaGainDbi(float antennaGainDbi) {
        this.antennaGainDbi = antennaGainDbi;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Integer getIdentificationAddress() {
        return identificationAddress;
    }

    public void setIdentificationAddress(Integer identificationAddress) {
        this.identificationAddress = identificationAddress;
    }

    public String getLastConnected() {
        return lastConnected;
    }

    public void setLastConnected(String lastConnected) {
        this.lastConnected = lastConnected;
    }

    public String getConnectedSince() {
        return connectedSince;
    }

    public void setConnectedSince(String connectedSince) {
        this.connectedSince = connectedSince;
    }

}
