package com.example.witono.jogjaflight.model;

public class Cabang
{
    private String iduser;

    private String logo;

    private String kota;

    private String nama;

    private String alamat;

    private String idcabang;

    public String getIduser ()
    {
        return iduser;
    }

    public void setIduser (String iduser)
    {
        this.iduser = iduser;
    }

    public String getLogo ()
    {
        return logo;
    }

    public void setLogo (String logo)
    {
        this.logo = logo;
    }

    public String getKota ()
    {
        return kota;
    }

    public void setKota (String kota)
    {
        this.kota = kota;
    }

    public String getNama ()
    {
        return nama;
    }

    public void setNama (String nama)
    {
        this.nama = nama;
    }

    public String getAlamat ()
    {
        return alamat;
    }

    public void setAlamat (String alamat)
    {
        this.alamat = alamat;
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
        return "Cabang [iduser = "+iduser+", logo = "+logo+", kota = "+kota+", nama = "+nama+", alamat = "+alamat+", idcabang = "+idcabang+"]";
    }
}
