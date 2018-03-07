package de.hampager.dap4j;

import de.hampager.dap4j.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DAPNETAPI {
    //ActivationResource
    @POST("activation")
    Call<Activation> postActivation(@Body Activation activation);

    //CallSignResource
    @GET("callsigns/{name}")
    Call<List<CallSign>> getCallSign(@Path("name") String name);

    @PUT("callsigns/{name}")
    Call<CallSign> putCallSign(@Path("name") String name);

    @DELETE("callsigns/{name}")
    Call<CallSign> deleteCallSign(@Path("name") String name);

    @GET("callsigns")
    Call<CallSign> getCallSign();

    //CallResource
    //Call without name to get all calls (admin only)
    @GET("calls/{ownerName}")
    Call<List<CallResource>> getCalls(@Query("ownerName") String name);

    @POST("calls")
    Call<CallResource> postCall(@Body CallResource callResource);


    //NewsResource
    //Call without name to get all news
    @GET("news/{rubricName}")
    Call<List<News>> getNews(@Query("rubricName") String name);

    @POST("news")
    Call<News> postNews(@Query("rubricName") String name, @Body News news);

    //NodeResource
    //Call without name to get all nodes
    @GET("nodes/{name}")
    Call<List<Node>> getNode(@Path("name") String name);

    @PUT("nodes/{name}")
    Call<Node> putNode(@Path("name") String name, @Body Node node);

    @DELETE("nodes/{name}")
    Call<Node> deleteNode(@Path("name") String name);

    //RubricResource
    //Call without name to get all rubrics
    @GET("rubrics/{name}")
    Call<List<Rubric>> getRubric(@Path("name") String name);

    @PUT("rubrics/{name}")
    Call<Rubric> putRubric(@Path("name") String name, @Body Rubric rubric);

    @DELETE("rubrics/{name}")
    Call<Rubric> deleteRubric(@Path("name") String name);


    //TransmitterGroupResource
    @GET("transmitterGroups/{name}")
    Call<List<TransmitterGroup>> getTransmitterGroup(@Path("name") String name);

    @PUT("transmitterGroups/{name}")
    Call<TransmitterGroup> putTransmitterGroup(@Path("name") String name, @Body TransmitterGroup transmitterGroup);

    @DELETE("transmitterGroups/{name}")
    Call<TransmitterGroup> deleteTransmitterGroup(@Path("name") String name);

    //TransmitterResource
    @GET("transmitters/{name}")
    Call<List<Transmitter>> getTransmitter(@Path("name") String name);

    @PUT("transmitters/{name}")
    Call<Transmitter> putTransmitter(@Path("name") String name, @Body Transmitter transmitter);

    @DELETE("transmitters/{name}")
    Call<Transmitter> deleteTransmitter(@Path("name") String name);

    //UserResource
    @GET("users/{name}")
    Call<List<User>> getUser(@Path("name") String name);

    @PUT("users/{name}")
    Call<User> putUser(@Path("name") String name, @Body User user);

    @DELETE("users/{name}")
    Call<User> deleteUser(@Path("name") String name);


    //TransmitterControl, according to WADL?
    @GET("transmitterControl/sendRubricNames/{name}")
    Call<Void> sendRubricNames(@Path("name") String name);

    //CoreResource, according to WADL
    @GET("core/version")
    Call<Version> getVersion();

    @GET("core/core_version")
    Call<SubVersion> getCoreVersion();

    @GET("core/api_version")
    Call<SubVersion> getApiVersion();

    //models.Stats, according to WADL
    @GET("stats")
    Call<Stats> getStats();
}
