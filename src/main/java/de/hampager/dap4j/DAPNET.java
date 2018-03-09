package de.hampager.dap4j;

import de.hampager.dap4j.callbacks.DapnetListener;
import de.hampager.dap4j.callbacks.DapnetResponse;
import de.hampager.dap4j.models.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class DAPNET {
    private DAPNETAPI service = DapnetSingleton.getInstance().getService();

    //
    //TODO: Fix things that should be void
    public void postActivation(Activation activation, final DapnetListener<Activation> listener) {
        Call<Activation> call = service.postActivation(activation);
        call.enqueue(new Callback<Activation>() {
            @Override
            public void onResponse(Call<Activation> call, Response<Activation> response) {
                listener.onResponse(new DapnetResponse<>(response.body()));
            }

            @Override
            public void onFailure(Call<Activation> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    //
    public void getAllCallSigns(final DapnetListener<List<CallSign>> listener) {
        Call<List<CallSign>> call = service.getAllCallSigns();
        call.enqueue(new Callback<List<CallSign>>() {
            @Override
            public void onResponse(Call<List<CallSign>> call, Response<List<CallSign>> response) {
                listener.onResponse(new DapnetResponse<>(response.body()));
            }

            @Override
            public void onFailure(Call<List<CallSign>> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    public void getCallSign(String name, final DapnetListener<CallSign> listener) {
        Call<CallSign> call = service.getCallSign(name);
        call.enqueue(new Callback<CallSign>() {
            @Override
            public void onResponse(Call<CallSign> call, Response<CallSign> response) {
                listener.onResponse(new DapnetResponse<>(response.body()));
            }

            @Override
            public void onFailure(Call<CallSign> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    //TODO: Name nötig?
    public void putCallSign(CallSign callSign, final DapnetListener<CallSign> listener) {
        Call<CallSign> call = service.putCallSign(callSign);
        call.enqueue(new Callback<CallSign>() {
            @Override
            public void onResponse(Call<CallSign> call, Response<CallSign> response) {
                listener.onResponse(new DapnetResponse<>(response.body()));
            }

            @Override
            public void onFailure(Call<CallSign> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    public void deleteCallSign(String name, final DapnetListener<CallSign> listener) {
        Call<CallSign> call = service.deleteCallSign(name);
        call.enqueue(new Callback<CallSign>() {
            @Override
            public void onResponse(Call<CallSign> call, Response<CallSign> response) {
                listener.onResponse(new DapnetResponse<>(response.body()));
            }

            @Override
            public void onFailure(Call<CallSign> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    // call without name to get whole List
    public void getCalls(String name, final DapnetListener<List<CallResource>> listener) {

    }

    public void postCall(CallResource callResource, final DapnetListener<CallResource> listener) {

    }

    // call without name to get whole List
    public void getNews(String name, final DapnetListener<List<News>> listener) {

    }

    //TODO: Name nötig?
    public void postNews(String name, News news, final DapnetListener<News> listener) {

    }

    //
    public void getAllNodes(final DapnetListener<List<Node>> listener) {

    }

    public void getNode(String name, final DapnetListener<Node> listener) {

    }

    //TODO: Name nötig?
    public void putNode(Node node, final DapnetListener<Node> listener) {

    }

    public void deleteNode(Node node, final DapnetListener<Node> listener) {

    }

    //
    public void getAllRubrics(final DapnetListener<List<Rubric>> listener) {

    }

    public void getRubric(String name, final DapnetListener<Rubric> listener) {

    }

    //TODO: Name nötig?
    public void putRubric(Rubric rubric, final DapnetListener<Rubric> listener) {

    }

    public void deleteRubric(Rubric rubric, final DapnetListener<Rubric> listener) {

    }

    //
    public void getAllTransmitterGroups(final DapnetListener<List<TransmitterGroup>> listener) {

    }

    public void getTransmitterGroup(String name, final DapnetListener<TransmitterGroup> listener) {

    }

    //TODO: Name nötig?
    public void putTransmitterGroup(TransmitterGroup transmitterGroup, final DapnetListener<TransmitterGroup> listener) {

    }

    public void deleteTransmitterGroup(String name, final DapnetListener<TransmitterGroup> listener) {

    }

    //
    public void getAllTransmitters(final DapnetListener<List<Transmitter>> listener) {

    }

    public void getTransmitter(String name, final DapnetListener<Transmitter> listener) {

    }

    //TODO: Name nötig?
    public void putTransmitter(Transmitter transmitter, final DapnetListener<Transmitter> listener) {

    }

    public void deleteTransmitter(Transmitter transmitter, final DapnetListener<> listener) {

    }

    //
    public void getAllUsers(final DapnetListener<List<User>> listener) {

    }

    public void getUser(String name, final DapnetListener<User> listener) {

    }

    //TODO: Name nötig?
    public void putUsers(User user, final DapnetListener<User> listener) {

    }

    public void deleteUser(String name, final DapnetListener<User> listener) {

    }

    //
    public void sendRubricNames(String name, final DapnetListener<> listener) {

    }

    //
    public void getVersion(final DapnetListener<Version> listener) {

    }

    public void getCoreVersion(final DapnetListener<SubVersion> listener) {

    }

    public void getApiVersion(final DapnetListener<SubVersion> listener) {

    }

    //
    public void getStats(final DapnetListener<Stats> listener) {

    }
}