package com.example.ammar.librarytest.presenter;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ammar.librarytest.Json;
import com.example.ammar.librarytest.model.AdvertModel;
import com.example.ammar.librarytest.model.CategoriesModel;
import com.example.ammar.librarytest.model.JsonDataModel;
import com.example.ammar.librarytest.model.Slider;
import com.google.gson.Gson;

import java.util.List;

public class QueryUtils {
    private final String TAG = QueryUtils.class.getSimpleName();
    private final String REQUEST_URL = "http://api2.turksale.net/api/main/home";
    private Context context;

    private OnResposeRecivedListner callback;
    public interface OnResposeRecivedListner {
        void OnResponseRecived(String response);
    }


    public QueryUtils(Context context) {
        this.context = context;
        newRequest();
    }

    public void newRequest() {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, REQUEST_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.v(TAG, response);
                        callback.OnResponseRecived(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v(TAG, error.toString());
            }
        });
        requestQueue.add(stringRequest);

    }

    public JsonDataModel modelResponse(String response) {
        Gson gson = new Gson();
        return gson.fromJson(response, JsonDataModel.class);
    }

    public List<Slider> getSliders(JsonDataModel jsonDataModel) {
        return jsonDataModel.getSlider();
    }

    public List<AdvertModel> getAdverts(JsonDataModel jsonDataModel) {
        return jsonDataModel.getAdvertising();
    }

    public List<CategoriesModel> getCategories(JsonDataModel jsonDataModel) {
        return jsonDataModel.getCategories();
    }
}