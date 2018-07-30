package com.example.witono.jogjaflight.di;

import com.example.witono.jogjaflight.network.NetworkModule;
import com.example.witono.jogjaflight.view.LoginActivity;
import com.example.witono.jogjaflight.view.ProfileActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(LoginActivity activity);
    void inject(ProfileActivity activity);

}
