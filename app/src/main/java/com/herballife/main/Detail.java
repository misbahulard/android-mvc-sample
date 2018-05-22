package com.herballife.main;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.herballife.main.controller.DetailPenyakitController;
import com.herballife.main.model.Penyakit;
import com.herballife.main.util.SQLiteDBHelper;

public class Detail extends Activity {
    private DetailPenyakitController mDetailPenyakitController;
    private Penyakit mPenyakit;
    private TextView nama;
    private TextView bahan;
    private TextView tutor;
    private Button button;
    private String cek;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_penyakit);
        nama = (TextView) findViewById(R.id.daftar_penyakit);
        bahan = (TextView) findViewById(R.id.bahan);
        button = (Button) findViewById(R.id.button1);
        tutor = (TextView) findViewById(R.id.tutorial);

        Intent qwe = getIntent();
        cek = qwe.getStringExtra("kirim_penyakit");

        mDetailPenyakitController = new DetailPenyakitController(this);
        mPenyakit = mDetailPenyakitController.getPenyakit(cek);

        nama.setText(mPenyakit.getNama());
        bahan.setText("Bahan : " + mPenyakit.getBahanObat());
        tutor.setText("Cara Menggunakan : " + mPenyakit.getTutorial());
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tombol = new Intent(Detail.this, List_catalog.class);
                startActivity(tombol);
            }
        });

    }
}
