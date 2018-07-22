package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


import com.example.witono.jogjaflight.R;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

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
