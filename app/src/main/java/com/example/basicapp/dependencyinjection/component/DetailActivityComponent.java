package com.example.basicapp.dependencyinjection.component;


import com.example.basicapp.dependencyinjection.scope.ActivityScope;
import com.example.basicapp.dependencyinjection.ui.DetailActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
@ActivityScope
public interface DetailActivityComponent {

    void inject(DetailActivity detailActivity);
}