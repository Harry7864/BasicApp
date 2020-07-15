package com.example.basicapp.dependencyinjection.component;

import android.content.Context;

import com.example.basicapp.dependencyinjection.MyApplication;
import com.example.basicapp.dependencyinjection.module.ContextModule;
import com.example.basicapp.dependencyinjection.module.RetrofitModule;
import com.example.basicapp.dependencyinjection.qualifier.ApplicationContext;
import com.example.basicapp.dependencyinjection.retrofit.APIInterface;
import com.example.basicapp.dependencyinjection.scope.ApplicationScope;

import dagger.Component;
@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}
