package com.example.basicapp.dependencyinjection.component;

import android.content.Context;

import com.example.basicapp.dependencyinjection.module.AdapterModule;
import com.example.basicapp.dependencyinjection.qualifier.ActivityContext;
import com.example.basicapp.dependencyinjection.qualifier.ApplicationContext;
import com.example.basicapp.dependencyinjection.scope.ActivityScope;
import com.example.basicapp.dependencyinjection.ui.MainActivity;

import dagger.Component;
import dagger.Module;

@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();


    void injectMainActivity(MainActivity mainActivity);
}
