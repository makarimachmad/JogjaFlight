package com.example.witono.jogjaflight.model;



/**
 * Created by XAgusart on 4/3/2018.
 */

public class Pembayaran {
    private String Judul;
    private String Tanggal;
    private String keterangan;

    public Pembayaran(String judul, String tanggal, String keterangan) {
        Judul = judul;
        Tanggal = tanggal;
        keterangan = keterangan;
    }

    public Pembayaran() {
    }


    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }




}
