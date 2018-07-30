package com.example.witono.jogjaflight;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.witono.jogjaflight.di.DaggerDeps;
import com.example.witono.jogjaflight.di.Deps;
import com.example.witono.jogjaflight.network.NetworkModule;


import java.io.File;

import io.paperdb.Paper;

public class BaseApp extends AppCompatActivity {
    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();
        Paper.init(this);

    }

    public Deps getDeps() {
        return deps;
    }
}
