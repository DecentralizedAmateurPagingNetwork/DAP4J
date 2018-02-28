package src.main.java.DAP4J;

import java.util.HashMap;
import java.util.Map;

public class Address {

    private String ipAddr;
    private Integer port;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}