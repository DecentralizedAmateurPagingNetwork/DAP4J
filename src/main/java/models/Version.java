package models;

public class Version {
    private String core;
    private String api;

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Version(String core, String api) {
        this.core = core;
        this.api = api;
    }
}
