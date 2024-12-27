package com.example.kelompok1;

public class ModelCatatan {
    String judul, isi, tanggal;

    public ModelCatatan(String judul, String isi, String tanggal){
        this.judul=judul;
        this.isi=isi;
        this.tanggal=tanggal;
    }

    public String getIsi() {
        return isi;
    }

    public String getJudul() {
        return judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
