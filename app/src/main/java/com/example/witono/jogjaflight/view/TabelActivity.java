package com.example.witono.jogjaflight.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.interfaces.TableCall;
import com.example.witono.jogjaflight.model.Jadwal;
import com.example.witono.jogjaflight.presenter.TablePresenter;
import com.example.witono.jogjaflight.repository.SiakadRepository;

import java.util.List;

import javax.inject.Inject;

public class TabelActivity extends BaseApp implements TableCall {

    private  TableLayout tablelayoutid;

    @Inject
    public SiakadRepository repository;
    private TablePresenter mPresenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDeps().inject(this);
        setContentView(R.layout.activity_tabel);
        int term =1;
        mPresenter = new TablePresenter(this,repository);
        mPresenter.getTable(2016,term,Common.User.getUsername());
       tablelayoutid = (TableLayout)this.findViewById(R.id.tablelayoutid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Inflate your row "template" and fill out the fields.

        return true;
    }


    @Override
    public void onSucces(List<Jadwal> data) {

        for(int i=0;i<3;i++){
            TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.layout_row, null);

            TextView text_kode   =(TextView)row.findViewById(R.id.id_kode);
            TextView text_mka   =(TextView)row.findViewById(R.id.id_mka);
            TextView text_waktu   =(TextView)row.findViewById(R.id.id_waktu);
            TextView text_sks   =(TextView)row.findViewById(R.id.id_sks);
            TextView text_dosen   =(TextView)row.findViewById(R.id.id_dosen);

            text_kode.setText(i+1+"");
            text_mka.setText(data.get(i).getNama_makul());
            text_waktu.setText(data.get(i).getJam_mulai());
            text_sks.setText(data.get(i).getSks());
            text_dosen.setText(data.get(i).getNama_lengkap());
            tablelayoutid.addView(row);
        }

    }

    @Override
    public void onFailure(String messages) {

    }
}