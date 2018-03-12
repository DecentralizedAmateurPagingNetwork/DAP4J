package de.hampager.dap4j;

public class DapnetSingleton {
    private static DAPNETAPI service;
    private static DAPNET dapnet;
    private static DapnetSingleton uniqueDapnet;
    private static String url = "http://hampager.de/api/";
    private static String user = "";
    private static String pass = "";

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
        //  if (user.equals("") || pass.equals(""))
        //     DapnetSingleton.service = ServiceGenerator.createService();
        //else
            DapnetSingleton.service = ServiceGenerator.createService(url, user, pass);

        DapnetSingleton.url = url;
        DapnetSingleton.user = user;
        DapnetSingleton.pass = pass;
        DapnetSingleton.dapnet = new DAPNET(DapnetSingleton.service);
    }

    public DAPNETAPI getService() {
        return DapnetSingleton.service;
    }

    public String getUrl() {
        return DapnetSingleton.url;
    }

    public String getUser() {
        return DapnetSingleton.user;
    }

    public String getPass() {
        return DapnetSingleton.pass;
    }

    public DAPNET getDapnet() {
        return DapnetSingleton.dapnet;
    }
}
