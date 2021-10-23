package com.emrekoyuncu2.cryptoapp.service;

import com.emrekoyuncu2.cryptoapp.model.CryptoModel;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=eca236e285c961088af0cc903d8e82364c0ee198

    @GET("prices?key=eca236e285c961088af0cc903d8e82364c0ee198")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}
