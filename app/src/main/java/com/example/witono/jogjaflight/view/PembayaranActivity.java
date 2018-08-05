package com.example.witono.jogjaflight.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.model.Pembayaran;

public class PembayaranActivity extends AppCompatActivity {

    TextView Judul, Tanggal, lokasi, detail, author;
    Pembayaran pembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamankosong);
        final String id = getIntent().getStringExtra("idacara");

        Judul = findViewById(R.id.acaradetail_judul);
        Tanggal = findViewById(R.id.acaradetail_tanggal);
        lokasi = findViewById(R.id.acaradetail_lokasi);
        detail = findViewById(R.id.acaradetail_keterangan);
        author =findViewById(R.id.acaradetail_author);
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference r = database.getReference("event");
//        r.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                acara =  dataSnapshot.child(id).getValue(Acara.class);
//
//                if(acara.getJudul()!= null) Judul.setText(acara.getJudul());
//                Tanggal.setText(acara.getTanggal());
//                lokasi.setText(acara.getLokasi());
//                detail.setText(acara.getKeterangan());
//                author.setText(acara.getAuthor());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    }
}
