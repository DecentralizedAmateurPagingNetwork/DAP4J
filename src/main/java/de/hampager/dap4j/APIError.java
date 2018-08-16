package de.hampager.dap4j;

public class APIError {
    private int statusCode;
    private String message;

    public APIError() {
        //TODO: Implement Error
    }

    public int status() {
        return statusCode;
    }

    public String message() {
        return message;
    }
}
