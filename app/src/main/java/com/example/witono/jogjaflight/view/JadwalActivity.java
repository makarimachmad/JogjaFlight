package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;

public class JadwalActivity extends AppCompatActivity{


    String[] variabelTerm={"Term 1","Term 2","Term 3","Term 4"};
    TextView judul,judultablejadwal;
    Button pencarian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        judul= findViewById(R.id.judulhalaman);
        judul.setText("Jadwal Siswa");

        judultablejadwal= findViewById(R.id.judul_jadwaltabel);
        judul.setText("Jadwal Siswa");

//        Typeface font = Typeface.createFromAsset(getAssets(), "Strato-linked.ttf");
//        ((TextView)findViewById(R.id.judulhalaman)).setTypeface(font);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        //spin.setOnItemSelectedListener(this);

        pencarian = findViewById(R.id.tombolcariin);

        CustomAdapter_Spinner customAdapter=new CustomAdapter_Spinner(getApplicationContext(),variabelTerm);
        spin.setAdapter(customAdapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0: // for item 1
                        Intent intent = new Intent(JadwalActivity.this, TabelActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        setContentView(R.layout.halamankosong);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void tombolcari(View view){
        Intent intents = new Intent(JadwalActivity.this,AbsensiActivity.class);
        startActivity(intents);
    }
}
