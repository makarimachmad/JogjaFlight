package com.example.witono.jogjaflight.repository;

import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.model.Cabang;
import com.example.witono.jogjaflight.model.LoginResponse;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.presenter.LoginPresenter;
import com.example.witono.jogjaflight.presenter.ProfilePresenter;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class SiakadRepository {
    private SiakadService siakadService;
    private LoginPresenter presenter;


    public SiakadRepository(SiakadService siakadService, LoginPresenter presenter) {
        this.siakadService = siakadService;
        this.presenter = presenter;
    }

    public SiakadRepository(SiakadService siakadService){
        this.siakadService = siakadService;
    }

    public void loginUser(String username,String password){
        siakadService.login(username,password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginResponse>() {
                    @Override
                    public void onCompleted() {


                    }

                    @Override
                    public void onError(Throwable e) {
                        presenter.onFailureResponse(e.getMessage());
                    }

                    @Override
                    public void onNext(LoginResponse loginResponse) {

                        if(loginResponse.getSucces()){
                            Common.User = loginResponse;
                            presenter.onSuccesResponse("succes");


                        }else {
                            presenter.onFailureResponse("succes");
                        }
                    }
                });
    }


    public Observable<List<Cabang>> getCabang (){
        return siakadService.getListCabang();
    }


}
