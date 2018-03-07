package de.hampager.dap4j.models;

public class Stats {
    private Integer users;
    private Integer calls;
    private Integer callsTotal;
    private Integer callSigns;
    private Integer news;
    private Integer newsTotal;
    private Integer rubrics;
    private Integer nodesTotal;
    private Integer nodesOnline;
    private Integer transmittersTotal;
    private Integer transmittersOnline;

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }

    public Integer getCalls() {
        return calls;
    }

    public void setCalls(Integer calls) {
        this.calls = calls;
    }

    public Integer getCallsTotal() {
        return callsTotal;
    }

    public void setCallsTotal(Integer callsTotal) {
        this.callsTotal = callsTotal;
    }

    public Integer getCallSigns() {
        return callSigns;
    }

    public void setCallSigns(Integer callSigns) {
        this.callSigns = callSigns;
    }

    public Integer getNews() {
        return news;
    }

    public void setNews(Integer news) {
        this.news = news;
    }

    public Integer getNewsTotal() {
        return newsTotal;
    }

    public void setNewsTotal(Integer newsTotal) {
        this.newsTotal = newsTotal;
    }

    public Integer getRubrics() {
        return rubrics;
    }

    public void setRubrics(Integer rubrics) {
        this.rubrics = rubrics;
    }

    public Integer getNodesTotal() {
        return nodesTotal;
    }

    public void setNodesTotal(Integer nodesTotal) {
        this.nodesTotal = nodesTotal;
    }

    public Integer getNodesOnline() {
        return nodesOnline;
    }

    public void setNodesOnline(Integer nodesOnline) {
        this.nodesOnline = nodesOnline;
    }

    public Integer getTransmittersTotal() {
        return transmittersTotal;
    }

    public void setTransmittersTotal(Integer transmittersTotal) {
        this.transmittersTotal = transmittersTotal;
    }

    public Integer getTransmittersOnline() {
        return transmittersOnline;
    }

    public void setTransmittersOnline(Integer transmittersOnline) {
        this.transmittersOnline = transmittersOnline;
    }

    public Stats(Integer users, Integer calls, Integer callsTotal, Integer callSigns, Integer news, Integer newsTotal, Integer rubrics, Integer nodesTotal, Integer nodesOnline, Integer transmittersTotal, Integer transmittersOnline) {
        this.users = users;
        this.calls = calls;
        this.callsTotal = callsTotal;
        this.callSigns = callSigns;
        this.news = news;
        this.newsTotal = newsTotal;
        this.rubrics = rubrics;
        this.nodesTotal = nodesTotal;
        this.nodesOnline = nodesOnline;
        this.transmittersTotal = transmittersTotal;
        this.transmittersOnline = transmittersOnline;
    }
}