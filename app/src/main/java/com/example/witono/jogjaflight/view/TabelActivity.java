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


    }

    @Override
    public void onFailure(String messages) {

    }
}