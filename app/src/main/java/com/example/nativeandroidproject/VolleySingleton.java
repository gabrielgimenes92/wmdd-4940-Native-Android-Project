package com.example.nativeandroidproject;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {

    private RequestQueue requestQueue;
    private static VolleySingleton instance;

    private VolleySingleton(Context mContext) {
        requestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
    }

    public static synchronized VolleySingleton getInstance(Context mContext) {
        if (instance == null) {
            instance = new VolleySingleton(mContext);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

}

