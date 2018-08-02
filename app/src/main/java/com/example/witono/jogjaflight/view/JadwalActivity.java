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
import com.example.witono.jogjaflight.presenter.CustomAdapter_Spinner;

public class JadwalActivity extends AppCompatActivity{


    String[] variabelTerm={"Term 1","Term 2","Term 3","Term 4"};
    TextView judul,judultablejadwal;
    String judulterm="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        judul= findViewById(R.id.judulhalaman);
        judul.setText("Jadwal Siswa");



//        Typeface font = Typeface.createFromAsset(getAssets(), "Strato-linked.ttf");
//        ((TextView)findViewById(R.id.judulhalaman)).setTypeface(font);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);


        CustomAdapter_Spinner customAdapter=new CustomAdapter_Spinner(getApplicationContext(),variabelTerm);
        spin.setAdapter(customAdapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            Button pencarian = findViewById(R.id.tombolcariin);
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0: // for item 1

                        pencarian.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent intent = new Intent(JadwalActivity.this, TabelJadwalActivity.class);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 1:
                        pencarian.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                judulterm="Term 2";
                                Intent intent = new Intent(JadwalActivity.this, TabelJadwalActivity.class);
                                startActivity(intent);
                                setContentView(R.layout.halamankosong);
                            }
                        });
                        break;

                    case 2:
                        pencarian.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.halamankosong);
                            }
                        });
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
