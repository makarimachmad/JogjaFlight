package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.interfaces.TableCall;
import com.example.witono.jogjaflight.model.Jadwal;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.repository.SiakadRepository;


import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class TablePresenter {
    private List<Jadwal> jadwalList;
    private SiakadService mService;
    private SiakadRepository repository;
    private TableCall tableView;

    public TablePresenter(TableCall tableCall, SiakadRepository repository){
        this.tableView = tableCall;
        this.repository = repository;

    }


    public void getTable(int tahun, int term, String nim){
        repository.getJadwal(tahun,term,nim).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Jadwal>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        tableView.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Jadwal> jadwals) {
                        tableView.onSucces(jadwals);
                    }
                });
    }


}
