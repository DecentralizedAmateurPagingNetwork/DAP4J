import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallResource {

    private String text;
    private List<String> callSignNames = null;
    private List<String> transmitterGroupNames = null;
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


}