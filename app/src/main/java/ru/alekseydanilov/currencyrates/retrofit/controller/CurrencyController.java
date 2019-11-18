package ru.alekseydanilov.currencyrates.retrofit.controller;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.alekseydanilov.currencyrates.retrofit.model.ServerResponse;

/**
 * Контроллер для получения курсов валют
 */
public interface CurrencyController {

    @GET("daily_json.js")
    Call<ServerResponse> getAllCurrency();
}
