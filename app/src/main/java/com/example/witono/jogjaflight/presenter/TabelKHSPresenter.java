package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.model.KolomTabelKHS;

/**
 07
 * Created by amit on 1/5/16.
 08
 */

public class TabelKHSPresenter {

    public KolomTabelKHS[] getInvoices() {

        KolomTabelKHS[] data = new KolomTabelKHS[20];

        for(int i = 0; i < 20; i ++) {
            KolomTabelKHS row = new KolomTabelKHS();
            row.id = (i+1);
            row.sks = "3";
            row.namamka ="ABCDEFGH";
            row.grade =  "A";
            data[i] = row;
        }
        return data;
    }
}