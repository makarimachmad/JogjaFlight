package com.example.witono.jogjaflight.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.interfaces.CallInterface;
import com.example.witono.jogjaflight.model.Cabang;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.presenter.ProfilePresenter;

import java.util.List;

import javax.inject.Inject;

import io.paperdb.Paper;

public class ProfileActivity extends BaseApp implements CallInterface {

    private TextView jurusan, nama, nim;
    private Button keluar;
    private ProfilePresenter mPresenter;
    @Inject
    public SiakadService siakadService;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getDeps().inject(this);
        mPresenter = new ProfilePresenter(siakadService,this);


         jurusan= findViewById(R.id.jurusan_profil);
         nim= findViewById(R.id.nim_profil);
         nama= findViewById(R.id.nama_profil);

        Cabang userCabang = null;

        if(Paper.exist("cabang")){
            List<Cabang> cabang = Paper.book().read("cabang");
            for(Cabang c : cabang){
                if(c.getIdcabang().equals(Common.User.getIdcabang())){
                    userCabang = c;
                    break;

                }
            }
            jurusan.setText(userCabang.getNama());
        }else {
            mPresenter.getCabang(Integer.parseInt(Common.User.getIdcabang()));
        }

        nama.setText(Common.User.getNama());
        nim.setText(Common.User.getUsername());

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
/*
        keluar = findViewById(R.id.btn_keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Paper.book().delete("cabang");
                Intent intent= new Intent(ProfileActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });*/
    }

    public void tombolbantu(View view){
        sendEmail();
    }

    protected void sendEmail() {
        Log.i("Send email", "");

        String[] TO = {"makarimachmad@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Selesai Mengirim...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ProfileActivity.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void tombol_keluar(View view){
        Intent intent= new Intent(ProfileActivity.this,LoginActivity.class);
        startActivity(intent);
    }


    public TextView getNama() {
        return nama;
    }

    public void setNama(TextView nama) {
        this.nama = nama;
    }

    public TextView getNim() {
        return nim;
    }

    public void setNim(TextView nim) {
        this.nim = nim;
    }

    public TextView getJurusan() {
        return jurusan;
    }

    public void setJurusan(TextView jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void onCallSucces(String messages) {
       jurusan.setText(messages);
    }

    @Override
    public void onCallFailure(String messages) {

    }
}
