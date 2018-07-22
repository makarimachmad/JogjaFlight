package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.interfaces.LoginInterface;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.repository.SiakadRepository;

public class LoginPresenter {
    private LoginInterface view;
    private SiakadRepository repository;


    public LoginPresenter(LoginInterface view,SiakadService service) {
        this.view = view;
        this.repository = new SiakadRepository(service,this);
    }


    public void login(String username, String password){
        repository.loginUser(username,password);
    }

    public void onFailureResponse(String messages){
        view.onLoginFailure(messages);
    }

    public void onSuccesResponse(String messages){
        view.onLoginSucces(messages);
    }
}
