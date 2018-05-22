package com.herballife.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.herballife.main.controller.PenyakitController;

import java.util.ArrayList;

public class List extends Activity {
    public ListView list;
    private PenyakitController mPenyakitController;
    private Button button;
    private int checked = -1;
    private ArrayList<String> mPenyakitNames = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        mPenyakitController = new PenyakitController(this);
        mPenyakitNames = mPenyakitController.getPenyakitNames();

        list = (ListView) findViewById(R.id.listpenyakit);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPenyakitNames);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {


            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                checked = arg2;
                String penyakit = mPenyakitNames.get(checked);

                Intent tambah = new Intent(List.this, Detail.class);
                tambah.putExtra("kirim_penyakit", penyakit);
                startActivity(tambah);
            }

        });
        button = (Button) findViewById(R.id.tombol_cari);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tombol = new Intent(List.this, Cari_Penyakit.class);
                startActivity(tombol);
            }
        });
    }
}
