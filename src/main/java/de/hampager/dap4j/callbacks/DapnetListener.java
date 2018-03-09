package de.hampager.dap4j.callbacks;

public interface DapnetListener<T> {
    void onResponse(DapnetResponse<T> response);

    void onFailure(Throwable t);
}

