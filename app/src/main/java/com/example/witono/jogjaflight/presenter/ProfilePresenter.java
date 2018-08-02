package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.interfaces.CallInterface;
import com.example.witono.jogjaflight.model.Cabang;

import com.example.witono.jogjaflight.repository.SiakadRepository;

import java.util.List;

import javax.inject.Inject;

import io.paperdb.Paper;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ProfilePresenter {

    private Cabang cabang;
    private CallInterface profileView;
    public SiakadRepository repository;

    public ProfilePresenter( CallInterface callInterface, SiakadRepository repository){

        this.profileView = callInterface;
        this.repository = repository;

    }


    public void getCabang(final int cabang_id){


        repository.getCabang().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Cabang>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Cabang> cabangs) {
                            for(Cabang c : cabangs){
                                if(c.getIdcabang().equals(Common.User.getIdcabang())){
                                    profileView.onCallSucces(c.getNama());
                                }
                            }
                            Paper.book().write("cabang",cabangs);

                    }
                });


    }



}
