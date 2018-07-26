package com.example.witono.jogjaflight.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;

public class ProfileActivity extends AppCompatActivity {

    TextView jurusan, nama, nim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView jurusan= findViewById(R.id.jurusan_profil);
        TextView nim= findViewById(R.id.nim_profil);
        TextView nama= findViewById(R.id.nama_profil);

        nama.setText("Abcdefg Hijklmn Opqrstu");
        nim.setText("123160000");
        jurusan.setText("Teknik Informatika");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.pekanbarulogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
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



}
