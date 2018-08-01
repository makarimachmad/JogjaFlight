package com.example.witono.jogjaflight.presenter;

import com.example.witono.jogjaflight.model.KolomTabelJadwal;

/**
 07
 * Created by amit on 1/5/16.
 08
 */

public class TabelJadwalPresenter {

    public KolomTabelJadwal[] getInvoices() {

        KolomTabelJadwal[] data = new KolomTabelJadwal[20];

        for(int i = 0; i < 20; i ++) {
            KolomTabelJadwal row = new KolomTabelJadwal();
            row.id = (i+1);
            row.kode = row.id;
            row.sks = "3";
            row.namamka ="ABCDEFGH";
            row.waktu =  "08:00-09:00";
            data[i] = row;
        }
        return data;
    }
}