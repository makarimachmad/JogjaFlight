package com.example.witono.jogjaflight.model;

public class Presensi
{
    private String kode_makul;

    private String tm;

    private String hari;

    private String nosiswa;

    private String sks;

    private String tanggal;

    private String tahun;

    private String nama_kelas;

    private String jam_selesai;

    private String jam_mulai;

    private String nama_lengkap;

    private String kehadiran;

    private String nama_makul;

    private String nama;

    private String idcabang;

    private String semester;

    public String getKode_makul ()
    {
        return kode_makul;
    }

    public void setKode_makul (String kode_makul)
    {
        this.kode_makul = kode_makul;
    }

    public String getTm ()
    {
        return tm;
    }

    public void setTm (String tm)
    {
        this.tm = tm;
    }

    public String getHari ()
    {
        return hari;
    }

    public void setHari (String hari)
    {
        this.hari = hari;
    }

    public String getNosiswa ()
    {
        return nosiswa;
    }

    public void setNosiswa (String nosiswa)
    {
        this.nosiswa = nosiswa;
    }

    public String getSks ()
    {
        return sks;
    }

    public void setSks (String sks)
    {
        this.sks = sks;
    }

    public String getTanggal ()
    {
        return tanggal;
    }

    public void setTanggal (String tanggal)
    {
        this.tanggal = tanggal;
    }

    public String getTahun ()
    {
        return tahun;
    }

    public void setTahun (String tahun)
    {
        this.tahun = tahun;
    }

    public String getNama_kelas ()
    {
        return nama_kelas;
    }

    public void setNama_kelas (String nama_kelas)
    {
        this.nama_kelas = nama_kelas;
    }

    public String getJam_selesai ()
    {
        return jam_selesai;
    }

    public void setJam_selesai (String jam_selesai)
    {
        this.jam_selesai = jam_selesai;
    }

    public String getJam_mulai ()
    {
        return jam_mulai;
    }

    public void setJam_mulai (String jam_mulai)
    {
        this.jam_mulai = jam_mulai;
    }

    public String getNama_lengkap ()
    {
        return nama_lengkap;
    }

    public void setNama_lengkap (String nama_lengkap)
    {
        this.nama_lengkap = nama_lengkap;
    }

    public String getKehadiran ()
    {
        return kehadiran;
    }

    public void setKehadiran (String kehadiran)
    {
        this.kehadiran = kehadiran;
    }

    public String getNama_makul ()
    {
        return nama_makul;
    }

    public void setNama_makul (String nama_makul)
    {
        this.nama_makul = nama_makul;
    }

    public String getNama ()
    {
        return nama;
    }

    public void setNama (String nama)
    {
        this.nama = nama;
    }

    public String getIdcabang ()
    {
        return idcabang;
    }

    public void setIdcabang (String idcabang)
    {
        this.idcabang = idcabang;
    }

    public String getSemester ()
    {
        return semester;
    }

    public void setSemester (String semester)
    {
        this.semester = semester;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [kode_makul = "+kode_makul+", tm = "+tm+", hari = "+hari+", nosiswa = "+nosiswa+", sks = "+sks+", tanggal = "+tanggal+", tahun = "+tahun+", nama_kelas = "+nama_kelas+", jam_selesai = "+jam_selesai+", jam_mulai = "+jam_mulai+", nama_lengkap = "+nama_lengkap+", kehadiran = "+kehadiran+", nama_makul = "+nama_makul+", nama = "+nama+", idcabang = "+idcabang+", semester = "+semester+"]";
    }
}
