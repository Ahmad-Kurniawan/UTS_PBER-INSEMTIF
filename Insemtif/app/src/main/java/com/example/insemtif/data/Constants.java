package com.example.insemtif.data;

import com.example.insemtif.R;

import java.util.ArrayList;

public class Constants {
    public static ArrayList<Dosen> getDosenData() {
        ArrayList<Dosen> list
                = new ArrayList<Dosen>();
        Dosen emp1 = new Dosen(1, R.drawable.noimage, "Iwan Iskandar, S.T., M.T.",
                "5865846");
        list.add(emp1);
        Dosen emp2
                = new Dosen(2, R.drawable.noimage, "Reski Mai Candra, S.T., M.Sc.", "6786464");
        list.add(emp2);
        Dosen emp3 = new Dosen(3, R.drawable.noimage, "Muhammad Affandes, S.T., M.T.",
                "5865846");
        list.add(emp3);
        Dosen emp4
                = new Dosen(4, R.drawable.noimage, "Fadhilah Syafria, S.T., M.Kom.", "6786464");
        list.add(emp4);
        return list;
    }
    public static ArrayList<Mahasiswa> getMahasiswaData() {
        ArrayList<Mahasiswa> list
                = new ArrayList<Mahasiswa>();
        Mahasiswa emp1 = new Mahasiswa("12250111514", R.drawable.noimage, "Ahmad Kurniawan",
                "5865846");
        list.add(emp1);
        Mahasiswa emp2
                = new Mahasiswa("12250111517", R.drawable.noimage, "Muhammad Faruq", "6786464");
        list.add(emp2);
        Mahasiswa emp3 = new Mahasiswa("12250111518", R.drawable.noimage, "Muhammad Aditya R",
                "5865846");
        list.add(emp3);
        Mahasiswa emp4
                = new Mahasiswa("12250111520", R.drawable.noimage, "Hafidz Alhadid", "6786464");
        list.add(emp4);
        return list;
    }
    public static ArrayList<MahasiswaKP> getMahasiswaKPData() {
        ArrayList<MahasiswaKP> list
                = new ArrayList<MahasiswaKP>();
        MahasiswaKP mhs1 = new MahasiswaKP("Ahmad Kurniawan","12250111514" ,R.drawable.tom,"Analisis Performa Jaringan Neural Convolutional pada Pengenalan Citra Medis Tomografi Komputer","Selesai");
        list.add(mhs1);
        MahasiswaKP mhs2
                = new MahasiswaKP("Muhammad Faruq", "12250111517" ,R.drawable.noimage,"Analisis Performa Jaringan Neural Convolutional pada Pengenalan Citra Medis Tomografi Komputer","Selesai");
        list.add(mhs2);
        MahasiswaKP mhs3 = new MahasiswaKP("Muhammad Aditya R", "12250111518",R.drawable.noimage,"Analisis Performa Jaringan Neural Convolutional pada Pengenalan Citra Medis Tomografi Komputer","Belum");
        list.add(mhs3);
        MahasiswaKP mhs4
                = new MahasiswaKP("Hafidz Alhadid", "12250111520",R.drawable.noimage,"Analisis Performa Jaringan Neural Convolutional pada Pengenalan Citra Medis Tomografi Komputer","Belum");
        list.add(mhs4);
        return list;
    }

    public static ArrayList<MahasiswaTA> getMahasiswaTAData() {
        ArrayList<MahasiswaTA> list
                = new ArrayList<MahasiswaTA>();
        MahasiswaTA mhs1 = new MahasiswaTA("Ahmad Kurniawan","12250111514" ,R.drawable.tom,"Pengembangan Aplikasi Mobile Berbasis Android untuk Monitoring Kualitas Udara dengan Sensor IoT","Belum");
        list.add(mhs1);
        MahasiswaTA mhs2
                = new MahasiswaTA("Muhammad Faruq", "12250111517" ,R.drawable.noimage,"Pengembangan Aplikasi Mobile Berbasis Android untuk Monitoring Kualitas Udara dengan Sensor IoT","Selesai");
        list.add(mhs2);
        MahasiswaTA mhs3 = new MahasiswaTA("Muhammad Aditya R", "12250111518",R.drawable.tom,"Pengembangan Aplikasi Mobile Berbasis Android untuk Monitoring Kualitas Udara dengan Sensor IoT","Belum");
        list.add(mhs3);
        MahasiswaTA mhs4
                = new MahasiswaTA("Hafidz Alhadid", "12250111520",R.drawable.noimage,"Pengembangan Aplikasi Mobile Berbasis Android untuk Monitoring Kualitas Udara dengan Sensor IoT","Belum");
        list.add(mhs4);
        return list;
    }

    public static ArrayList<JadwalSeminar> getJadwalSeminar() {
        ArrayList<JadwalSeminar> list
                = new ArrayList<JadwalSeminar>();
        JadwalSeminar j1 = new JadwalSeminar("Jumat 3-6-2024","FT 301" ,"Selesai");
        list.add(j1);
        JadwalSeminar j2
                = new JadwalSeminar("Jumat 10-6-2024", "FT 302" ,"Belum");
        list.add(j2);
        JadwalSeminar j3 = new JadwalSeminar("Jumat 10-6-2024", "FT 301","Belum");
        list.add(j3);
        JadwalSeminar j4
                = new JadwalSeminar("Sabtu 11-6-2024", "FT 301","Selesai");
        list.add(j4);
        return list;
    }
}
