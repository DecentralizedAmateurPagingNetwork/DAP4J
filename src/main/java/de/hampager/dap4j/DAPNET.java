package de.hampager.dap4j;

import de.hampager.dap4j.callbacks.DapnetListener;
import de.hampager.dap4j.callbacks.DapnetResponse;
import de.hampager.dap4j.models.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class DAPNET {
    private DAPNETAPI service;
    private DAPNETAPI fallbackService;
    private DAPNET fallbackDapnet;
    public DAPNET(DAPNETAPI service) {
        this.service = service;
    }
    private <E> void genericConnection(Call<E> call, final DapnetListener<E> listener) {
        call.enqueue(new Callback<E>() {
            @Override
            public void onResponse(Call<E> call, Response<E> response) {
                listener.onResponse(new DapnetResponse<>(response.body(), response.isSuccessful()));
            }

            @Override
            public void onFailure(Call<E> call, Throwable t) {

                if (!fallbackDapnet.CheckCall(call))
                    listener.onFailure(t);
            }
        });
    }

    <E> boolean CheckCall(Call<E> call) {
        boolean ret = false;
        return ret;
    }

    //
    public void postActivation(Activation activation, final DapnetListener<Activation> listener) {
        Call<Activation> call = service.postActivation(activation);
        genericConnection(call, listener);
    }


    //
    public void getAllCallSigns(final DapnetListener<List<CallSign>> listener) {
        Call<List<CallSign>> call = service.getAllCallSigns();
        genericConnection(call, listener);
    }
    public void getCallSign(String name, final DapnetListener<CallSign> listener) {
        Call<CallSign> call = service.getCallSign(name);
        genericConnection(call, listener);
    }

    public void putCallSign(String name, CallSign callSign, final DapnetListener<CallSign> listener) {
        Call<CallSign> call = service.putCallSign(name, callSign);
        genericConnection(call, listener);
    }

    public void deleteCallSign(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteCallSign(name);
        genericConnection(call, listener);
    }

    // call without name to get whole List
    public void getCalls(String name, final DapnetListener<List<CallResource>> listener) {
        Call<List<CallResource>> call = service.getCalls("");
        genericConnection(call, listener);
    }

    public void postCall(CallResource callResource, final DapnetListener<CallResource> listener) {
        Call<CallResource> call = service.postCall(callResource);
        genericConnection(call, listener);
    }

    // call without name to get whole List
    public void getNews(String name, final DapnetListener<List<News>> listener) {
        Call<List<News>> call = service.getNews(name);
        genericConnection(call, listener);
    }

    public void postNews(News news, final DapnetListener<News> listener) {
        Call<News> call = service.postNews(news);
        genericConnection(call, listener);
    }

    //
    public void getAllNodes(final DapnetListener<List<Node>> listener) {
        Call<List<Node>> call = service.getAllNodes();
        genericConnection(call, listener);
    }

    public void getNode(String name, final DapnetListener<Node> listener) {
        Call<Node> call = service.getNode(name);
        genericConnection(call, listener);
    }

    public void putNode(String name, Node node, final DapnetListener<Node> listener) {
        Call<Node> call = service.putNode(name, node);
        genericConnection(call, listener);
    }

    public void deleteNode(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteNode(name);
        genericConnection(call, listener);
    }

    //
    public void getAllRubrics(final DapnetListener<List<Rubric>> listener) {
        Call<List<Rubric>> call = service.getAllRubrics();
        genericConnection(call, listener);
    }

    public void getRubric(String name, final DapnetListener<Rubric> listener) {
        Call<Rubric> call = service.getRubric(name);
        genericConnection(call, listener);
    }

    public void putRubric(String name, Rubric rubric, final DapnetListener<Rubric> listener) {
        Call<Rubric> call = service.putRubric(name, rubric);
        genericConnection(call, listener);
    }

    public void deleteRubric(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteRubric(name);
        genericConnection(call, listener);
    }

    //
    public void getAllTransmitterGroups(final DapnetListener<List<TransmitterGroup>> listener) {
        Call<List<TransmitterGroup>> call = service.getAllTransmitterGroups();
        genericConnection(call, listener);
    }

    public void getTransmitterGroup(String name, final DapnetListener<TransmitterGroup> listener) {
        Call<TransmitterGroup> call = service.getTransmitterGroup(name);
        genericConnection(call, listener);
    }

    public void putTransmitterGroup(String name, TransmitterGroup transmitterGroup, final DapnetListener<TransmitterGroup> listener) {
        Call<TransmitterGroup> call = service.putTransmitterGroup(name, transmitterGroup);
        genericConnection(call, listener);
    }

    public void deleteTransmitterGroup(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteTransmitterGroup(name);
        genericConnection(call, listener);
    }

    //
    public void getAllTransmitters(final DapnetListener<List<Transmitter>> listener) {
        Call<List<Transmitter>> call = service.getAllTransmitters();
        genericConnection(call, listener);
    }

    public void getTransmitter(String name, final DapnetListener<Transmitter> listener) {
        Call<Transmitter> call = service.getTransmitter(name);
        genericConnection(call, listener);
    }

    public void putTransmitter(String name, Transmitter transmitter, final DapnetListener<Transmitter> listener) {
        Call<Transmitter> call = service.putTransmitter(name, transmitter);
        genericConnection(call, listener);
    }

    public void deleteTransmitter(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteTransmitter(name);
        genericConnection(call, listener);
    }

    //
    public void getAllUsers(final DapnetListener<List<User>> listener) {
        Call<List<User>> call = service.getAllUsers();
        genericConnection(call, listener);
    }

    public void getUser(String name, final DapnetListener<User> listener) {
        Call<User> call = service.getUser(name);
        genericConnection(call, listener);
    }

    public void putUsers(String name, User user, final DapnetListener<User> listener) {
        Call<User> call = service.putUser(name, user);
        genericConnection(call, listener);
    }

    public void deleteUser(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.deleteUser(name);
        genericConnection(call, listener);
    }

    //
    public void sendRubricNames(String name, final DapnetListener<Void> listener) {
        Call<Void> call = service.sendRubricNames(name);
        genericConnection(call, listener);
    }

    //
    public void getVersion(final DapnetListener<Version> listener) {
        Call<Version> call = service.getVersion();
        genericConnection(call, listener);
    }

    public void getCoreVersion(final DapnetListener<SubVersion> listener) {
        Call<SubVersion> call = service.getCoreVersion();
        genericConnection(call, listener);
    }

    public void getApiVersion(final DapnetListener<SubVersion> listener) {
        Call<SubVersion> call = service.getApiVersion();
        genericConnection(call, listener);
    }

    //
    public void getStats(final DapnetListener<Stats> listener) {
        Call<Stats> call = service.getStats();
        genericConnection(call, listener);
    }
}