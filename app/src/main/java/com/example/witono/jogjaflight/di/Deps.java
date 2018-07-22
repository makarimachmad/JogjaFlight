package com.example.witono.jogjaflight.di;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.network.NetworkModule;
import com.example.witono.jogjaflight.view.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(LoginActivity activity);

}
