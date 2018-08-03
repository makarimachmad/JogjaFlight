package com.example.witono.jogjaflight.interfaces;

import com.example.witono.jogjaflight.model.Jadwal;

import java.util.List;

public interface TableCall {
    void onSucces(List data);
    void onFailure(String messages);
}
