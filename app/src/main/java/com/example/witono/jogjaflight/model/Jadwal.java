package com.example.witono.jogjaflight.model;

public class Jadwal
{
    private String kode_makul;

    private String jam_selesai;

    private String jam_mulai;

    private String nama_lengkap;

    private String hari;

    private String nama_makul;

    private String nosiswa;

    private String kode_program;

    private String sks;

    private String nama;

    private String nama_ruangan;

    private String nama_kelas;

    private String semester;

    public String getKode_makul ()
    {
        return kode_makul;
    }

    public void setKode_makul (String kode_makul)
    {
        this.kode_makul = kode_makul;
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

    public String getHari ()
    {
        return hari;
    }

    public void setHari (String hari)
    {
        this.hari = hari;
    }

    public String getNama_makul ()
    {
        return nama_makul;
    }

    public void setNama_makul (String nama_makul)
    {
        this.nama_makul = nama_makul;
    }

    public String getNosiswa ()
    {
        return nosiswa;
    }

    public void setNosiswa (String nosiswa)
    {
        this.nosiswa = nosiswa;
    }

    public String getKode_program ()
    {
        return kode_program;
    }

    public void setKode_program (String kode_program)
    {
        this.kode_program = kode_program;
    }

    public String getSks ()
    {
        return sks;
    }

    public void setSks (String sks)
    {
        this.sks = sks;
    }

    public String getNama ()
    {
        return nama;
    }

    public void setNama (String nama)
    {
        this.nama = nama;
    }

    public String getNama_ruangan ()
    {
        return nama_ruangan;
    }

    public void setNama_ruangan (String nama_ruangan)
    {
        this.nama_ruangan = nama_ruangan;
    }

    public String getNama_kelas ()
    {
        return nama_kelas;
    }

    public void setNama_kelas (String nama_kelas)
    {
        this.nama_kelas = nama_kelas;
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
        return "ClassPojo [kode_makul = "+kode_makul+", jam_selesai = "+jam_selesai+", jam_mulai = "+jam_mulai+", nama_lengkap = "+nama_lengkap+", hari = "+hari+", nama_makul = "+nama_makul+", nosiswa = "+nosiswa+", kode_program = "+kode_program+", sks = "+sks+", nama = "+nama+", nama_ruangan = "+nama_ruangan+", nama_kelas = "+nama_kelas+", semester = "+semester+"]";
    }
}

