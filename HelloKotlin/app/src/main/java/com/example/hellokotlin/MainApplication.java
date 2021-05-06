package com.example.hellokotlin;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
    private static Context appConText;

    public static Context get_appContext() {
        return appConText;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appConText = getApplicationContext();
}
}
