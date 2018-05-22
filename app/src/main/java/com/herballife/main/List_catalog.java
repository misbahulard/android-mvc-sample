package com.herballife.main;


import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.herballife.main.controller.CatalogController;
import com.herballife.main.util.SQLiteDBHelper;

public class List_catalog extends Activity {
    private CatalogController catalogController;
    public ListView list;
    int checked = -1;
    ArrayList<String> catalogNames = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_katalog);

        catalogController = new CatalogController(this);
        catalogNames = catalogController.getCatalogNames();

        list = (ListView) findViewById(R.id.list_tumbuhan);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, catalogNames);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                checked = arg2;
                String tumbuhan = catalogNames.get(checked);

                Intent tambah = new Intent(List_catalog.this, Detail_katalog.class);
                tambah.putExtra("kirim_tumbuhan", tumbuhan);
                startActivity(tambah);
            }
        });

    }
}