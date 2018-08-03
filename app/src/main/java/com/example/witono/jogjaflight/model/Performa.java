package com.example.witono.jogjaflight.model;

public class Performa
{
    private String kriteria;

    private String nilai;

    private String minggu;

    private String nosiswa;

    private String kategori;

    private String tahun;

    private String semester;

    public String getKriteria ()
    {
        return kriteria;
    }

    public void setKriteria (String kriteria)
    {
        this.kriteria = kriteria;
    }

    public String getNilai ()
    {
        return nilai;
    }

    public void setNilai (String nilai)
    {
        this.nilai = nilai;
    }

    public String getMinggu ()
    {
        return minggu;
    }

    public void setMinggu (String minggu)
    {
        this.minggu = minggu;
    }

    public String getNosiswa ()
    {
        return nosiswa;
    }

    public void setNosiswa (String nosiswa)
    {
        this.nosiswa = nosiswa;
    }

    public String getKategori ()
    {
        return kategori;
    }

    public void setKategori (String kategori)
    {
        this.kategori = kategori;
    }

    public String getTahun ()
    {
        return tahun;
    }

    public void setTahun (String tahun)
    {
        this.tahun = tahun;
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
        return "ClassPojo [kriteria = "+kriteria+", nilai = "+nilai+", minggu = "+minggu+", nosiswa = "+nosiswa+", kategori = "+kategori+", tahun = "+tahun+", semester = "+semester+"]";
    }
}

