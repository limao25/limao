package com.example.lib_core_one.network;

import com.example.lib_core_one.uri.MyApiuri;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyHttpManger  {

    private static volatile MyHttpManger myHttpManger;

    public MyHttpManger() {

    }

    private static synchronized MyHttpManger getInstance(){
        if (myHttpManger == null){
            myHttpManger = new MyHttpManger();
        }
        return myHttpManger;
    }

    public Retrofit retrofit;


    public Retrofit NoTokenRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(MyApiuri.uri)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(createNoTokenClient())
                .build();

        return  retrofit;
    }

    private OkHttpClient createNoTokenClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .writeTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .addInterceptor(createNoTokenInterceptor())
                .build();

        return client;
    }

    private Interceptor createNoTokenInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return interceptor;
    }

    public Retrofit TokenRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(MyApiuri.uri)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(createToeknClient())
                .build();

        return retrofit;
    }

    private OkHttpClient createToeknClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .writeTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .addInterceptor(createToeknInterceptor())
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request header = chain.request().newBuilder()
                                .addHeader("", "").build();

                        Response proceed = chain.proceed(header);
                        return proceed;
                    }
                })
                .build();

        return client;
    }

    private Interceptor createToeknInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return interceptor;
    }


}
