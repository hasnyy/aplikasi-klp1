package com.example.kelompok1;

public class ModelCatatan {
    String judul, isi, tanggal, background, jam ;

    public ModelCatatan(String judul, String isi, String tanggal, String bg, String jam){
        this.judul = judul;
        this.isi=isi;
        this.tanggal=tanggal;
        this.background=bg;
        this.jam=jam;
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

    public String getJam() {
        return jam;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String bg) {
        this.background = bg;
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

    public void setJam(String jam) {
        this.jam = jam;
    }
}