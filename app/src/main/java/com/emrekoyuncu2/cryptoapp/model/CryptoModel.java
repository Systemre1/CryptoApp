package com.emrekoyuncu2.cryptoapp.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    public String currency;

    @SerializedName("price")
    public String price;

}
