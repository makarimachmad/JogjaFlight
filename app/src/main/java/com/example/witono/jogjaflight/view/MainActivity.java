package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.model.GambarBerita;
import com.example.witono.jogjaflight.presenter.GambarBerita_Adapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<GambarBerita> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.harley2, R.drawable.benz2,
            R.drawable.vecto,R.drawable.webshots ,R.drawable.bikess,R.drawable.img1};

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();

    }

    private ArrayList<GambarBerita> populateList(){

        ArrayList<GambarBerita> list = new ArrayList<>();

        for(int i = 0; i < myImageList.length; i++){
            GambarBerita imageModel = new GambarBerita();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new GambarBerita_Adapter(MainActivity.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(myImageList.length * density);

        NUM_PAGES =imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

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
        Intent intents = new Intent(MainActivity.this,KHSActivity.class);
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
        Intent intents = new Intent(MainActivity.this,KHSActivity.class);
        startActivity(intents);
    }
    public void tombol_pengalaman(View view){
        Intent intents = new Intent(MainActivity.this,MataKuliahActivity.class);
        startActivity(intents);
    }
}
