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

    //RubricResource
    @GET("/rubrics")
    Call<List<Rubric>> getAllRubrics();
    @GET("/rubrics/{name}")
    Call<Rubric> getRubric(@Path("name") String name);
    @PUT("/rubrics/{name}")
    Call<Rubric> putRubric(@Path("name") String name);
    @DELETE ("/rubrics/{name}")
    Call<Rubric> deleteRubric(@Path("name") String name);

    //TransmitterGroupResource
    @GET("/transmitterGroups")
    Call<List<TransmitterGroup>> getAllTransmitterGroups();
    @GET("/transmitterGroups/{name}")
    Call<TransmitterGroup> getTransmitterGroup(@Path("name") String name);
    @PUT("/transmitterGroups/{name}")
    Call<TransmitterGroup> putTransmitterGroup(@Path("name") String name);
    @DELETE("/transmitterGroups/{name}")
    Call<TransmitterGroup> deleteTransmitterGroup(@Path("name") String name);

    //TransmitterResource
    @GET("/transmitters")
    Call<List<Transmitter>> getAllTransmitters();
    @GET("/transmitters/{name}")
    Call<Transmitter> getTransmitter(@Path("name") String name);
    @PUT("/transmitters/{name}")
    Call<Transmitter> putTransmitter(@Path("name") String name);
    @DELETE("/transmitters/{name}")
    Call<Transmitter> deleteTransmitter(@Path("name") String name);

    //UserResource
    @GET("/users")
    Call<List<User>> getAllUsers();
    @GET("/users/{name}")
    Call<User> getUser(@Path("name") String name);
    @PUT("/users/{name}")
    Call<User> putUser(@Path("name") String name);
    @DELETE("/users/{name}")
    Call<User> deleteUser(@Path("name") String name);
}
