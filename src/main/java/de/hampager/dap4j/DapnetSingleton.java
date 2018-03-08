package de.hampager.dap4j;

public class DapnetSingleton {
    private static DAPNETAPI service;
    private static DapnetSingleton uniqueDapnet;
    private String url = "http://hampager.de/api/";
    private String user = "";
    private String pass = "";

    // verhinderte Instanziierung von außen.
    private DapnetSingleton() {
    }

    public static synchronized DapnetSingleton getInstance() {
        if (DapnetSingleton.uniqueDapnet == null) {
            DapnetSingleton.uniqueDapnet = new DapnetSingleton();
            DapnetSingleton.uniqueDapnet.init();
        }
        return DapnetSingleton.uniqueDapnet;
    }

    public void init() {
        init(url, user, pass);
    }

    public void init(String url, String user, String pass) {
        if (user.equals("") || pass.equals(""))
            DapnetSingleton.service = ServiceGenerator.createService(url);
        else
            DapnetSingleton.service = ServiceGenerator.createService(url, user, pass);
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public DAPNETAPI getService() {
        return DapnetSingleton.service;
    }
}
