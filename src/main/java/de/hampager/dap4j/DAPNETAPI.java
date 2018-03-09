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
    @GET("callsigns/")
    Call<List<CallSign>> getAllCallSigns();

    @GET("callsigns/{name}")
    Call<CallSign> getCallSign(@Path("name") String name);

    //TODO: JSONBODY HINZUFÜGEN
    @PUT("callsigns/{name}")
    Call<CallSign> putCallSign(@Path("name") String name, @Body CallSign callSign);

    @DELETE("callsigns/{name}")
    Call<Void> deleteCallSign(@Path("name") String name);

    @GET("callsigns")
    Call<CallSign> getCallSign();

    //CallResource
    //Call without name to get all calls (admin only)
    @GET("calls/{ownerName}")
    Call<List<CallResource>> getCalls(@Path("ownerName") String name);

    @POST("calls")
    Call<CallResource> postCall(@Body CallResource callResource);


    //NewsResource
    //Call without name to get all news
    @GET("news/{rubricName}")
    Call<List<News>> getNews(@Query("rubricName") String name);

    @POST("news")
    Call<News> postNews(@Body News news);

    //NodeResource
    //Call without name to get all nodes
    @GET("nodes/")
    Call<List<Node>> getAllNodes();
    @GET("nodes/{name}")
    Call<Node> getNode(@Path("name") String name);
    @PUT("nodes/{name}")
    Call<Node> putNode(@Path("name") String name, @Body Node node);

    @DELETE("nodes/{name}")
    Call<Void> deleteNode(@Path("name") String name);

    //RubricResource
    //Call without name to get all rubrics
    @GET("rubrics/")
    Call<List<Rubric>> getAllRubrics();
    @GET("rubrics/{name}")
    Call<Rubric> getRubric(@Path("name") String name);

    @PUT("rubrics/{name}")
    Call<Rubric> putRubric(@Path("name") String name, @Body Rubric rubric);

    @DELETE("rubrics/{name}")
    Call<Void> deleteRubric(@Path("name") String name);


    //TransmitterGroupResource
    @GET("transmitterGroups/")
    Call<List<TransmitterGroup>> getAllTransmitterGroups();
    @GET("transmitterGroups/{name}")
    Call<TransmitterGroup> getTransmitterGroup(@Path("name") String name);

    @PUT("transmitterGroups/{name}")
    Call<TransmitterGroup> putTransmitterGroup(@Path("name") String name, @Body TransmitterGroup transmitterGroup);

    @DELETE("transmitterGroups/{name}")
    Call<Void> deleteTransmitterGroup(@Path("name") String name);

    //TransmitterResource
    @GET("transmitters/")
    Call<List<Transmitter>> getAllTransmitters();
    @GET("transmitters/{name}")
    Call<Transmitter> getTransmitter(@Path("name") String name);

    @PUT("transmitters/{name}")
    Call<Transmitter> putTransmitter(@Path("name") String name, @Body Transmitter transmitter);

    @DELETE("transmitters/{name}")
    Call<Void> deleteTransmitter(@Path("name") String name);

    //UserResource
    @GET("users")
    Call<List<User>> getAllUsers();
    @GET("users/{name}")
    Call<User> getUser(@Path("name") String name);

    @PUT("users/{name}")
    Call<User> putUser(@Path("name") String name, @Body User user);

    @DELETE("users/{name}")
    Call<Void> deleteUser(@Path("name") String name);


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
