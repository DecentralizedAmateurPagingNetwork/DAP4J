package de.hampager.dap4j.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class News implements Serializable {
    private final static long serialVersionUID = 6193971714890413970L;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("rubricName")
    @Expose
    private String rubricName;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("ownerName")
    @Expose
    private String ownerName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubricName) {
        this.rubricName = rubricName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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