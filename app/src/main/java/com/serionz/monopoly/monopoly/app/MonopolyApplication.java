package com.serionz.monopoly.monopoly.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.google.firebase.FirebaseApp;

/**
 * Created by edwinkato on 12/18/17.
 */

public class MonopolyApplication extends Application {

    private static MonopolyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        try {
            FirebaseApp.initializeApp(this);
        } catch (Exception e) {
        }
    }

    public static Context getInstance() {
        return mInstance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
