package com.example.witono.jogjaflight.repository;

import com.example.witono.jogjaflight.network.NetworkModule;
import com.example.witono.jogjaflight.network.SiakadService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {NetworkModule.class})
public class RepositoryModule {
    @Provides
    @Singleton
    SiakadRepository provideSiakadRepo(SiakadService service){
        return new SiakadRepository(service);
    }
}
