package com.example.witono.jogjaflight.model;

public class Punishmen {
    private String detail;

    private String pelanggaran_id;

    private String keterangan;

    private String nosiswa;

    private String nama_perform;

    private String penanganan;

    private String tanggal;

    private String tingkat;

    public String getDetail ()
    {
        return detail;
    }

    public void setDetail (String detail)
    {
        this.detail = detail;
    }

    public String getPelanggaran_id ()
    {
        return pelanggaran_id;
    }

    public void setPelanggaran_id (String pelanggaran_id)
    {
        this.pelanggaran_id = pelanggaran_id;
    }

    public String getKeterangan ()
    {
        return keterangan;
    }

    public void setKeterangan (String keterangan)
    {
        this.keterangan = keterangan;
    }

    public String getNosiswa ()
    {
        return nosiswa;
    }

    public void setNosiswa (String nosiswa)
    {
        this.nosiswa = nosiswa;
    }

    public String getNama_perform ()
    {
        return nama_perform;
    }

    public void setNama_perform (String nama_perform)
    {
        this.nama_perform = nama_perform;
    }

    public String getPenanganan ()
    {
        return penanganan;
    }

    public void setPenanganan (String penanganan)
    {
        this.penanganan = penanganan;
    }

    public String getTanggal ()
    {
        return tanggal;
    }

    public void setTanggal (String tanggal)
    {
        this.tanggal = tanggal;
    }

    public String getTingkat ()
    {
        return tingkat;
    }

    public void setTingkat (String tingkat)
    {
        this.tingkat = tingkat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [detail = "+detail+", pelanggaran_id = "+pelanggaran_id+", keterangan = "+keterangan+", nosiswa = "+nosiswa+", nama_perform = "+nama_perform+", penanganan = "+penanganan+", tanggal = "+tanggal+", tingkat = "+tingkat+"]";
    }
}
