package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.witono.jogjaflight.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.logojakarta);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void tombolabsensi(View view){
        Intent intents = new Intent(MainActivity.this,AbsensiActivity.class);
        startActivity(intents);
    }
    public void tomboljadwal(View view){
        Intent intents = new Intent(MainActivity.this,JadwalActivity.class);
        startActivity(intents);
    }
    public void tombolnilai(View view){
        Intent intents = new Intent(MainActivity.this,NilaiActivity.class);
        startActivity(intents);
    }
    public void tombolmatakuliah(View view){
        Intent intents = new Intent(MainActivity.this,MataKuliahActivity.class);
        startActivity(intents);
    }
}
