package de.hampager.dap4j.models;

public class Pager {
    private Integer number;
    private String name;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pager(Integer number, String name) {
        this.number = number;
        this.name = name;
    }
}
