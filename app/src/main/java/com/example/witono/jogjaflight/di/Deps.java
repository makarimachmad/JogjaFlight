package com.example.witono.jogjaflight.di;

import com.example.witono.jogjaflight.network.NetworkModule;
import com.example.witono.jogjaflight.repository.RepositoryModule;
import com.example.witono.jogjaflight.view.LoginActivity;
import com.example.witono.jogjaflight.view.ProfileActivity;
import com.example.witono.jogjaflight.view.TabelActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {RepositoryModule.class})
public interface Deps {
    void inject(LoginActivity activity);
    void inject(ProfileActivity activity);
    void inject(TabelActivity activity);

}
