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

public class NilaiActivity extends AppCompatActivity{


    String[] semester={"Term 1","Term 2","Term 3","Term 4"};
    TextView judul,judultablejadwal;
    int term =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        judul= findViewById(R.id.judulhalaman);
        judul.setText("Dafrar Nilai");

//        Typeface font = Typeface.createFromAsset(getAssets(), "Strato-linked.ttf");
//        ((TextView)findViewById(R.id.judulhalaman)).setTypeface(font);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);

        CustomAdapter_Spinner customAdapter=new CustomAdapter_Spinner(getApplicationContext(),semester);
        spin.setAdapter(customAdapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            Button pencarian = findViewById(R.id.tombolcariin);
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                term = position+1;
                Intent intent = new Intent(NilaiActivity.this,TabelKHSActivity.class);
                intent.putExtra("term",term);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}
