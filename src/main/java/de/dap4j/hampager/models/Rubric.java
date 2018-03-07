package de.dap4j.hampager.models;

import java.util.List;

public class Rubric {

    private String name;
    private Integer number;
    private List<String> transmitterGroupNames;
    private String label;
    private List<String> ownerNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public Rubric(String name, Integer number, List<String> transmitterGroupNames, String label, List<String> ownerNames) {
        this.name = name;
        this.number = number;
        this.transmitterGroupNames = transmitterGroupNames;
        this.label = label;
        this.ownerNames = ownerNames;
    }
}
