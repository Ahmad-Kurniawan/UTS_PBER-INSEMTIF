package com.example.insemtif.data;


import java.io.Serializable;

public class MahasiswaTA implements Serializable {
    private String nama,NIDN,judul,status;
    private int foto;

    public MahasiswaTA(String nama,String NIDN,int foto, String judul, String status) {
        this.nama = nama;
        this.NIDN = NIDN;
        this.foto = foto;
        this.judul = judul;
        this.status = status;
    }

    // Getters and setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String NIDN) {
        this.judul = judul;
    }
    public String getStatus() {
        return status;
    }

    public void setName(String status) {
        this.status = status;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int id) {
        this.foto = foto;
    }
}

