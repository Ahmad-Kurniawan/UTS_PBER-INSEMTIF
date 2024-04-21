package com.example.insemtif.data;


import java.io.Serializable;

public class JadwalSeminar implements Serializable {
    private String waktu, tempat, keterangan;

    public JadwalSeminar(String waktu, String tempat, String keterangan) {
        this.waktu = waktu;
        this.tempat = tempat;
        this.keterangan = keterangan;
    }

    // Getters and setters
    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
