package com.example.witono.jogjaflight.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;

public class NilaiPerformaActivity extends AppCompatActivity {

    TextView judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        judul= findViewById(R.id.judulhalaman);
        judul.setText("Nilai Performa");

//        Typeface font = Typeface.createFromAsset(getAssets(), "Strato-linked.ttf");
//        ((TextView)findViewById(R.id.judulhalaman)).setTypeface(font);
    }
}
