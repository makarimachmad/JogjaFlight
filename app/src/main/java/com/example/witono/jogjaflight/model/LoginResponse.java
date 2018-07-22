package com.example.witono.jogjaflight.model;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    private Boolean succes;
    private String id_users;
    private String idcabang;
    private String username;
    private String nama;
    private String role;
    private String keterangan;

    public Boolean getSucces() {
        return succes;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public String getId_users() {
        return id_users;
    }

    public void setId_users(String id_users) {
        this.id_users = id_users;
    }

    public String getIdcabang() {
        return idcabang;
    }

    public void setIdcabang(String idcabang) {
        this.idcabang = idcabang;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
