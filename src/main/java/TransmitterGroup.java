import java.util.List;

public class TransmitterGroup {

    private String name;
    private String description;
    private List<String> transmitterNames = null;
    private List<String> ownerNames = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTransmitterNames() {
        return transmitterNames;
    }

    public void setTransmitterNames(List<String> transmitterNames) {
        this.transmitterNames = transmitterNames;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

}