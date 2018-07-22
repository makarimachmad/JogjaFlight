package com.example.witono.jogjaflight.model;

import java.io.Serializable;

public class LoginResponse implements Serializable{
    private Boolean exist;

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }
}
