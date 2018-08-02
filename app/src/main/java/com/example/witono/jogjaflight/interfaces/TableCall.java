package com.example.witono.jogjaflight.interfaces;

import com.example.witono.jogjaflight.model.Jadwal;

import java.util.List;

public interface TableCall {
    void onSucces(List<Jadwal> data);
    void onFailure(String messages);
}
