package com.example.basicapp.dependencyinjection.module;

import android.content.Context;

import com.example.basicapp.dependencyinjection.qualifier.ApplicationContext;
import com.example.basicapp.dependencyinjection.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
