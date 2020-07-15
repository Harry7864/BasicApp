package com.example.basicapp.dependencyinjection;

import android.app.Activity;
import android.app.Application;


import com.example.basicapp.dependencyinjection.component.ApplicationComponent;
import com.example.basicapp.dependencyinjection.component.DaggerApplicationComponent;
import com.example.basicapp.dependencyinjection.module.ContextModule;

import dagger.android.DaggerApplication;
import dagger.android.support.DaggerAppCompatActivity;

public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);

    }

    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}