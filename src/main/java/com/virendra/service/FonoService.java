package com.virendra.service;

import com.aafanasev.fonoapi.DeviceEntity;
import com.aafanasev.fonoapi.retrofit.FonoApiFactory;
import com.aafanasev.fonoapi.retrofit.FonoApiService;
import com.google.gson.Gson;
import retrofit2.Response;

import java.io.IOException;


public class FonoService {


    // TODO: Get FONO token from https://fonoapi.freshpixl.com/token/generate but service is not working.
    private static final String TOKEN = "";
    private FonoApiService fonoApiService;

    public FonoService() {
        fonoApiService = new FonoApiFactory().create();

    }

    public String getPhoneDetails(String deviceName) throws IOException {
        Response<List<DeviceEntity>> response = fonoApiService.getLatest(TOKEN, deviceName, 1).execute();
        response.body().forEach(device -> new Gson().toJson(device));
    }
}
