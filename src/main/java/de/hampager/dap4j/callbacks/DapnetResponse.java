package de.hampager.dap4j.callbacks;

public class DapnetResponse<T> {
    private final T body;
    private final boolean successful;

    public DapnetResponse(T body, Boolean successful) {
        this.body = body;
        this.successful = successful;
    }

    public T body() {
        return body;
    }

    public Boolean isSuccessful() {
        return successful;
    }
}
