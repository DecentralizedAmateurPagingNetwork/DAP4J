package de.hampager.dap4j.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("ip_addr")
    @Expose
    private String ipAddr;
    @SerializedName("port")
    @Expose
    private Integer port;

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Address(String ipAddr, Integer port) {
        this.ipAddr = ipAddr;
        this.port = port;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return ipAddr + ':' + port;
    }
}