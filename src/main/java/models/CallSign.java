package models;

import java.util.List;

public class CallSign {
    private String name;
    private String description;
    private List<Pager> pagers = null;
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

    public List<Pager> getPagers() {
        return pagers;
    }

    public void setPagers(List<Pager> pagers) {
        this.pagers = pagers;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public CallSign(String name, String description, List<Pager> pagers, List<String> ownerNames) {
        this.name = name;
        this.description = description;
        this.pagers = pagers;
        this.ownerNames = ownerNames;
    }

    public CallSign(String name, String description, List<String> ownerNames) {
        this.name = name;
        this.description = description;
        this.ownerNames = ownerNames;
    }
}
