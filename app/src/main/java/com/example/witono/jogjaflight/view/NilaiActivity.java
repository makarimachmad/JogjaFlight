package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.witono.jogjaflight.R;

public class NilaiActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    String[] countryNames={"Term 1","Term 2","Term 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nilai_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter_JadwalActivity customAdapter=new CustomAdapter_JadwalActivity(getApplicationContext(),countryNames);
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
        Intent intents = new Intent(NilaiActivity.this,AbsensiActivity.class);
        startActivity(intents);
    }
}
