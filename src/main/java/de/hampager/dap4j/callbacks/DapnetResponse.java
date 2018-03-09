package de.hampager.dap4j.callbacks;

public class DapnetResponse<T> {
    private final T body;

    public DapnetResponse(T body) {
        this.body = body;
    }

    public T body() {
        return body;
    }
}
