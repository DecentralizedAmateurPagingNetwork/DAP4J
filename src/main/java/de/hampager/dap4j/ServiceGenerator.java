package de.hampager.dap4j;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    // Trailing slash needed for resolution!
    private static String apiBaseUrl = "http://hampager.de/api/";

    public static Retrofit retrofit;
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(apiBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create());

    //private static Retrofit retrofit = builder.build();

    private static HttpLoggingInterceptor logging =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.HEADERS);

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();



    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null, null);
    }

    public static <S> S createService(
            Class<S> serviceClass, String username, String password) {
        if (!isEmpty(username)
                && !isEmpty(password)) {
            String authToken = Credentials.basic(username, password);
            return createService(serviceClass, authToken);
        }

        return createService(serviceClass, null);
    }

    public static <S> S createService(
            Class<S> serviceClass, final String authToken) {
        if (!isEmpty(authToken)) {
            AuthenticationInterceptor interceptor =
                    new AuthenticationInterceptor(authToken);

            if (!httpClient.interceptors().contains(interceptor)) {
                httpClient.addInterceptor(interceptor);
            }

        }
        ErrorInterceptor error = new ErrorInterceptor();
        if (!httpClient.interceptors().contains(error)) {
            httpClient.addInterceptor(error);
        }
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();
        }
        return retrofit.create(serviceClass);
    }

    // No need to instantiate this class.
    private ServiceGenerator() {
    }

    public static DAPNETAPI createService() {
        return createService(DAPNETAPI.class);
    }

    public static DAPNETAPI createService(String url, String username, String password) {
        changeApiBaseUrl(url);
        return createService(username, password);
    }
    public static DAPNETAPI createService(String username, String password) {
        return createService(DAPNETAPI.class, username, password);
    }

    public static DAPNETAPI createService(String authToken) {
        return createService(DAPNETAPI.class, authToken);
    }

    public static void changeApiBaseUrl(String newApiBaseUrl) {
        apiBaseUrl = newApiBaseUrl;

        builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(apiBaseUrl);
    }
    private static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

}
