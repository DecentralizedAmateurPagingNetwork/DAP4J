package de.hampager.dap4j.callbacks;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public interface DapnetCallback {

    void onResponse(Call<ResponseBody> call, Response<ResponseBody> response);

    void onFailure(Call<ResponseBody> call, Throwable t);
}
