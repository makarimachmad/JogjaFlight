package com.example.witono.jogjaflight.model;

public class Tracer {

    private String tahap;

    private String perusahaan;

    private String posisi;

    private String nosiswa;

    private String hasil;

    private String nama;

    private String id_tracker;

    private String tanggal;

    private String idcabang;

    public String getTahap ()
    {
        return tahap;
    }

    public void setTahap (String tahap)
    {
        this.tahap = tahap;
    }

    public String getPerusahaan ()
    {
        return perusahaan;
    }

    public void setPerusahaan (String perusahaan)
    {
        this.perusahaan = perusahaan;
    }

    public String getPosisi ()
    {
        return posisi;
    }

    public void setPosisi (String posisi)
    {
        this.posisi = posisi;
    }

    public String getNosiswa ()
    {
        return nosiswa;
    }

    public void setNosiswa (String nosiswa)
    {
        this.nosiswa = nosiswa;
    }

    public String getHasil ()
    {
        return hasil;
    }

    public void setHasil (String hasil)
    {
        this.hasil = hasil;
    }

    public String getNama ()
    {
        return nama;
    }

    public void setNama (String nama)
    {
        this.nama = nama;
    }

    public String getId_tracker ()
    {
        return id_tracker;
    }

    public void setId_tracker (String id_tracker)
    {
        this.id_tracker = id_tracker;
    }

    public String getTanggal ()
    {
        return tanggal;
    }

    public void setTanggal (String tanggal)
    {
        this.tanggal = tanggal;
    }

    public String getIdcabang ()
    {
        return idcabang;
    }

    public void setIdcabang (String idcabang)
    {
        this.idcabang = idcabang;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tahap = "+tahap+", perusahaan = "+perusahaan+", posisi = "+posisi+", nosiswa = "+nosiswa+", hasil = "+hasil+", nama = "+nama+", id_tracker = "+id_tracker+", tanggal = "+tanggal+", idcabang = "+idcabang+"]";
    }
}
