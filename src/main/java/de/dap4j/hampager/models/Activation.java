package de.dap4j.hampager.models;

import java.util.List;

public class Activation {
    //@SerializedName("number")
    //@Expose
    private Integer number;
    //@SerializedName("transmitterGroupNames")
    //@Expose
    private List<String> transmitterGroupNames;
    //@SerializedName("timestamp")
    //@Expose
    private String timestamp;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<String> getTransmitterGroupNames() {
        return transmitterGroupNames;
    }

    public void setTransmitterGroupNames(List<String> transmitterGroupNames) {
        this.transmitterGroupNames = transmitterGroupNames;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Activation(Integer number, List<String> transmitterGroupNames, String timestamp) {
        this.number = number;
        this.transmitterGroupNames = transmitterGroupNames;
        this.timestamp = timestamp;
    }

    public Activation(Integer number, List<String> transmitterGroupNames) {
        this.number = number;
        this.transmitterGroupNames = transmitterGroupNames;
    }
}
