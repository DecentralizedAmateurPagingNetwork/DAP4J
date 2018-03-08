package de.hampager.dap4j;

public class DAPNET {
    // unique instance
    private static DAPNET uniqueDapnet;
    private DAPNETAPI dapnetapi = ServiceGenerator.createService();
    private String url;
    private String username;
    private String password;

    // block instantiation from others
    private DAPNET() {
    }

    // global method to retrieve instance
    public static synchronized DAPNET getInstance() {
        if (DAPNET.uniqueDapnet == null) {
            DAPNET.uniqueDapnet = new DAPNET();
        }
        return uniqueDapnet;
    }

    public DAPNETAPI getDapnetapi() {
        return dapnetapi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        ServiceGenerator.changeApiBaseUrl(url);
        if (username != null && password != null)
            dapnetapi = ServiceGenerator.createService(username, password);
        else
            dapnetapi = ServiceGenerator.createService();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsernamePassword(String username, String password) {
        this.username = username;
        this.password = password;
        ServiceGenerator.createService(username, password);
    }

}