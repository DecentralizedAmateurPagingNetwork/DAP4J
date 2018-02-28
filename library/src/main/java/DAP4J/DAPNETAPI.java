package src.main.java.DAP4J;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DAPNETAPI {
    //ActivationResource
    @POST("/activation")
    Call<Activation> postActivation();

    //CallSignResource
    @GET("/callsigns/{name}")
    Call<CallSign> getCallSign(@Path("name") String name);
    @PUT("/callsigns/{name}")
    Call<CallSign> putCallSign(@Path("name") String name);
    @DELETE("/callsigns/{name}")
    Call<CallSign> deleteCallSign(@Path("name") String name);
    @GET("/callsigns")
    Call<CallSign> getCallSign();

    //CallResource
    @GET("/calls")
    Call<List<CallResource>> getOwnCalls(@Query("ownerName") String name);
    @GET("/calls")
    Call<List<CallResource>> getAllCalls();
    @POST("/calls")
    Call<CallResource> postCall();

    //CoreResource
    @GET("/core")
    Call<Version> getFullVersion();
    @GET("/core/core_version")
    Call<Version> getCoreVersion();
    @GET("/core/api_version")
    Call<Version> getApiVersion();

    //NewsResource
    @GET("/news")
    Call<List<News>> getAllNews();
    @GET("/news")
    Call<List<News>> getNews(@Query("rubricName") String name);
    @POST("/news")
    Call<News> postNews(@Query("rubricName") String name);

    //NodeResource
    @GET("/nodes")
    Call<List<Node>> getAllNodes();
    @GET("/nodes/{name}")
    Call<Node> getNode(@Path("name") String name);
    @PUT("/nodes/{name}")
    Call<Node> putNode(@Path("name") String name);
    @DELETE("/nodes/{name}")
    Call<Node> deleteNode(@Path("name") String name);


}
