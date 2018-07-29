package com.example.witono.jogjaflight.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.witono.jogjaflight.R;

public class TabelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        TableLayout tablelayoutid = (TableLayout)this.findViewById(R.id.tablelayoutid);
        // Inflate your row "template" and fill out the fields.
        for(int i=0;i<3;i++){
            TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.layout_row, null);

            TextView text_kode   =(TextView)row.findViewById(R.id.id_kode);
            TextView text_mka   =(TextView)row.findViewById(R.id.id_mka);
            TextView text_waktu   =(TextView)row.findViewById(R.id.id_waktu);
            TextView text_sks   =(TextView)row.findViewById(R.id.id_sks);
            TextView text_dosen   =(TextView)row.findViewById(R.id.id_dosen);

            text_kode.setText(i+"");
            text_mka.setText("abcdefgh");
            text_waktu.setText("senin, 10:00-12:00");
            text_sks.setText("3");
            text_dosen.setText("raffi ahmad");
            tablelayoutid.addView(row);
        }
        return true;
    }


}