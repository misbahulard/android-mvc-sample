package com.herballife.main.model;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.herballife.main.util.SQLiteDBHelper;

import java.util.ArrayList;

public class CatalogModel {
    private SQLiteDBHelper helper;
    private static SQLiteDatabase db;
    private ArrayList<String> catalogNames = new ArrayList<String>();
    private ArrayList<String> penyakitNames = new ArrayList<String>();

    public CatalogModel(Context context) {
        helper = new SQLiteDBHelper(context);
    }

    private SQLiteDatabase getDb() {
        return helper.getDb();
    }

    public ArrayList<String> getCatalogNames() {
        try {
            db = getDb();

            String sql = "select * from Katalog";
            Cursor c = db.rawQuery(sql, null);
            c.moveToFirst();


            int i = 0;
            while (!c.isAfterLast()) {
                int index = c.getColumnIndex("Nama");
                String temp = c.getString(index);
                catalogNames.add(temp);

                i++;
                c.moveToNext();
            }

            c.close();

            return catalogNames;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Tumbuhan getTumbuhan(String queryNama) {
        try {
            Tumbuhan tumbuhan = new Tumbuhan();
            db = getDb();

            String sql = "select * from Katalog where Nama ='"+queryNama+"'";
            Cursor c = db.rawQuery(sql, null);
            c.moveToFirst();

            int idIndex = c.getColumnIndex("TumbuhanID");
            int namaIndex = c.getColumnIndex("Nama");
            int kegunaanIndex = c.getColumnIndex("Kegunaan");
            int gambarIndex = c.getColumnIndex("Gambar");

            int id = c.getInt(idIndex);
            String nama = c.getString(namaIndex);
            String kegunaan = c.getString(kegunaanIndex);
            byte[] image_byte = c.getBlob(gambarIndex);

            tumbuhan.setTumbuhanId(id);
            tumbuhan.setNama(nama);
            tumbuhan.setKegunaan(kegunaan);
            tumbuhan.setGambar(image_byte);

            c.close();

            return tumbuhan;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<String> getPenyakitNames() {
        try {
            db = getDb();

            String sql = "select * from data_penyakit";
            Cursor c = db.rawQuery(sql, null);
            c.moveToFirst();


            int i = 0;
            while (!c.isAfterLast()) {
                int index = c.getColumnIndex("Nama");
                String temp = c.getString(index);
                penyakitNames.add(temp);

                i++;
                c.moveToNext();
            }

            c.close();

            return penyakitNames;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Penyakit getPenyakit(String queryNama) {
        try {
            Penyakit penyakit = new Penyakit();
            db = getDb();

            String sql = "select * from data_penyakit where Nama ='"+queryNama+"'";
            Cursor c = db.rawQuery(sql, null);
            c.moveToFirst();

            int idIndex = c.getColumnIndex("PenyakitID");
            int namaIndex = c.getColumnIndex("Nama");
            int bahanObatIndex = c.getColumnIndex("BahanObat");
            int tutorialIndex = c.getColumnIndex("Tutorial");

            int id = c.getInt(idIndex);
            String nama = c.getString(namaIndex);
            String bahanObat = c.getString(bahanObatIndex);
            String tutorial = c.getString(tutorialIndex);

            penyakit.setIdenyakit(id);
            penyakit.setNama(nama);
            penyakit.setBahanObat(bahanObat);
            penyakit.setTutorial(tutorial);

            c.close();

            return penyakit;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
