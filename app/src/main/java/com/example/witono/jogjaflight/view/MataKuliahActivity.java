package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;

public class MataKuliahActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    String[] countryNames={"Term 1","Term 2","Term 3"};
    TextView judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        judul= findViewById(R.id.judulhalaman);
        judul.setText("Absensi Siswa");

//        Typeface font = Typeface.createFromAsset(getAssets(), "Strato-linked.ttf");
//        ((TextView)findViewById(R.id.judulhalaman)).setTypeface(font);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter_Spinner customAdapter=new CustomAdapter_Spinner(getApplicationContext(),countryNames);
        spin.setAdapter(customAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        //Toast.makeText(getApplicationContext(), countryNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void tombolcari(View view){
        Intent intents = new Intent(MataKuliahActivity.this,AbsensiActivity.class);
        startActivity(intents);
    }
}
