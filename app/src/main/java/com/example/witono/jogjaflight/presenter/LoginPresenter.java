package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.interfaces.CallInterface;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.repository.SiakadRepository;

public class LoginPresenter {
    private CallInterface view;
    private SiakadRepository repository;


    public LoginPresenter(CallInterface view, SiakadService service) {
        this.view = view;
        this.repository = new SiakadRepository(service,this);
    }


    public void login(String username, String password){
        repository.loginUser(username,password);
    }

    public void onFailureResponse(String messages){
        view.onCallSucces(messages);
    }

    public void onSuccesResponse(String messages){
        view.onCallSucces(messages);
    }
}
