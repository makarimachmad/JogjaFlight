package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.witono.jogjaflight.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    //private Toolbar toolbar;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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
        getSupportActionBar().setHomeButtonEnabled(true);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            Intent intents = new Intent(MainActivity.this,ProfileActivity.class);
            startActivity(intents);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
    public void tombolnilai_performa(View view){
        Intent intents = new Intent(MainActivity.this,AbsensiActivity.class);
        startActivity(intents);
    }
    public void tombol_pelanggaran(View view){
        Intent intents = new Intent(MainActivity.this,JadwalActivity.class);
        startActivity(intents);
    }
    public void tombol_pembayaran(View view){
        Intent intents = new Intent(MainActivity.this,NilaiActivity.class);
        startActivity(intents);
    }
    public void tombol_pengalaman(View view){
        Intent intents = new Intent(MainActivity.this,MataKuliahActivity.class);
        startActivity(intents);
    }
}
