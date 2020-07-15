package com.example.basicapp.dependencyinjection.module;

import android.content.Context;

import com.example.basicapp.dependencyinjection.qualifier.ActivityContext;
import com.example.basicapp.dependencyinjection.scope.ActivityScope;
import com.example.basicapp.dependencyinjection.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }

}