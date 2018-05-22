package com.herballife.main;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.herballife.main.controller.DetailCatalogController;
import com.herballife.main.model.Tumbuhan;

public class Detail_katalog extends Activity {
    private DetailCatalogController mDetailCatalogController;
    private Tumbuhan mTumbuhan;
    private TextView nama;
    private TextView guna;
    private ImageView gambar;
    private String cek;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_katalog);
        Intent qwe = getIntent();
        cek = qwe.getStringExtra("kirim_tumbuhan");

        nama = (TextView) findViewById(R.id.nama_tumbuhan);
        guna = (TextView) findViewById(R.id.kegunaan);
        gambar = (ImageView) findViewById(R.id.gambar);

        mDetailCatalogController = new DetailCatalogController(this);
        mTumbuhan = mDetailCatalogController.getTumbuhan(cek);

        Bitmap image = BitmapFactory.decodeByteArray(mTumbuhan.getGambar(), 0, mTumbuhan.getGambar().length);
        gambar.setImageBitmap(image);
        guna.setText("Kegunaan : " + mTumbuhan.getKegunaan());
        nama.setText(mTumbuhan.getNama());
    }
}