package com.example.witono.jogjaflight.model;

public class Nilai
{
    private String nama_makul;

    private String nosiswa;

    private String grade;

    private String sks;

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

    public String getGrade ()
    {
        return grade;
    }

    public void setGrade (String grade)
    {
        this.grade = grade;
    }

    public String getSks ()
    {
        return sks;
    }

    public void setSks (String sks)
    {
        this.sks = sks;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nama_makul = "+nama_makul+", nosiswa = "+nosiswa+", grade = "+grade+", sks = "+sks+"]";
    }
}

