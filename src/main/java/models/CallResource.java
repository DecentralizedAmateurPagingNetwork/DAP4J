package models;

import java.util.List;

public class CallResource {

    private String text;
    private List<String> callSignNames;
    private List<String> transmitterGroupNames;
    private Boolean emergency;
    private String timestamp;
    private String ownerName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getCallSignNames() {
        return callSignNames;
    }

    public void setCallSignNames(List<String> callSignNames) {
        this.callSignNames = callSignNames;
    }

    public List<String> getTransmitterGroupNames() {
        return transmitterGroupNames;
    }

    public void setTransmitterGroupNames(List<String> transmitterGroupNames) {
        this.transmitterGroupNames = transmitterGroupNames;
    }

    public Boolean getEmergency() {
        return emergency;
    }

    public void setEmergency(Boolean emergency) {
        this.emergency = emergency;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public CallResource(String text, List<String> callSignNames, List<String> transmitterGroupNames, Boolean emergency, String timestamp, String ownerName) {
        this.text = text;
        this.callSignNames = callSignNames;
        this.transmitterGroupNames = transmitterGroupNames;
        this.emergency = emergency;
        this.timestamp = timestamp;
        this.ownerName = ownerName;
    }

    public CallResource(String text, List<String> callSignNames, List<String> transmitterGroupNames, Boolean emergency) {
        this.text = text;
        this.callSignNames = callSignNames;
        this.transmitterGroupNames = transmitterGroupNames;
        this.emergency = emergency;
    }
}