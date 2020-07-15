package com.example.basicapp.dependencyinjection.module;

import com.example.basicapp.dependencyinjection.adapter.RecyclerViewAdapter;
import com.example.basicapp.dependencyinjection.scope.ActivityScope;
import com.example.basicapp.dependencyinjection.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getStarWarsPeopleLIst(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity) {
        return mainActivity;
    }
}