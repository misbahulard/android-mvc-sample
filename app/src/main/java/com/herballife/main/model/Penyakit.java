package com.herballife.main.model;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public class Penyakit {
    private int idenyakit;
    private String nama;
    private String bahanObat;
    private String tutorial;

    public int getIdenyakit() {
        return idenyakit;
    }

    public void setIdenyakit(int idenyakit) {
        this.idenyakit = idenyakit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahanObat() {
        return bahanObat;
    }

    public void setBahanObat(String bahanObat) {
        this.bahanObat = bahanObat;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }
}
