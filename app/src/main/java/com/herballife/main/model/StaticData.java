package com.herballife.main.model;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public class StaticData {
    private String help = "             Herbal Life  \n\n"
            + "Herbal Life adalah \n"
            + "aplikasi berbasis android \n"
            + "yang berisi cara pengobatan penyakit\n"
            + "terutama menggunakan tumbuhan herbal\n\n"
            + "Menu Search:\n"
            + "Digunakan untuk mencari jenis \n"
            + "penyakit sesuai dengan keyword yang dimasukkan\n\n"
            + "Menu Katalog:\n"
            + "Berisi seluruh daftar tumbuhan \n"
            + "yang bisa digunakan sebagai obat\n\n"
            + "Application Name :\n\n"
            + "Herbal Life v1.0.0\n\n" + "Developed By : \n\n"
            + "Nama : Fajar Teguh \n"
            + "Nrp    : 2103121006 \n"
            + "Nama : Abdurachman Rizal    \n"
            + "Nrp    : 2103121007 \n"
            + "Nama : Moch Fajar Ramadhan \n"
            + "Nrp    : 2103121027\n\n";

    private String[] saran = {"Batuk Pada Anak", "Sakit Perut", "Diare", "Mual",
            "Kembung", "Wasir", "Biduran",
            "Demam", "Step", "Kencing Batu", "Radang Paru-paru", "Asma", "Mimisan", "Hepatitis",
            "Prostat", "Keputihan", "Diabetes Melitus", "Bisul", "Jerawat", "Gatal berupa bintik-bintik merah bergelembung air",
            "Gatal pada bekas luka yang sudah kering", "Nyeri haid", "Haid bau anyir", "Batuk Kering", "Sariawan", "Campak",
            "Borok", "Jantung Lemah", "Gangguan saraf", "Rematik", "Demam Pada Anak", "Masuk Angin", "Disentri", "Hipertensi",
            "Diabetes", "Kutu Air", "Sakit Kepala", "Flu", "Bronkitis", "Cacingan", "Migrain", "Maag", "Cantengan", "Osteoporosis"};

    public String getHelp() {
        return help;
    }

    public String[] getSaran() {
        return saran;
    }
}
