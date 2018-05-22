package com.herballife.main.model;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public class Tumbuhan {
    private int tumbuhanId;
    private String nama;
    private String kegunaan;
    private byte[] gambar;

    public int getTumbuhanId() {
        return tumbuhanId;
    }

    public void setTumbuhanId(int tumbuhanId) {
        this.tumbuhanId = tumbuhanId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }
}
