package ru.alekseydanilov.currencyrates;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import androidx.multidex.MultiDexApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.alekseydanilov.currencyrates.retrofit.controller.CurrencyController;

import static ru.alekseydanilov.currencyrates.Settings.SERVER_URL;

public class App extends MultiDexApplication {

    private Retrofit retrofit;

    private static CurrencyController currencyController;

    public static CurrencyController getCurrencyController() {
        return currencyController;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder()
                .setLenient()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        currencyController = retrofit.create(CurrencyController.class);
    }
}
