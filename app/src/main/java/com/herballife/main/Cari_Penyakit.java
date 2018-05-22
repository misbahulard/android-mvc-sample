package com.herballife.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.herballife.main.controller.CariPenyakitController;


public class Cari_Penyakit extends Activity implements TextWatcher {
    private CariPenyakitController mCariPenyakitController;
    private TextView selection;
    private AutoCompleteTextView edit;
    private String[] saran;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cari_penyakit);
        selection = (TextView) findViewById(R.id.selection);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);

        mCariPenyakitController = new CariPenyakitController();
        saran = mCariPenyakitController.getSaran();

        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, saran));
        edit.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent tambah = new Intent(Cari_Penyakit.this, Detail.class);
                String a = edit.getText().toString();
                tambah.putExtra("kirim_penyakit", a);
                startActivity(tambah);
            }
        });
    }

    public void onTextChanged(CharSequence s, int start, int count, int before) {
        selection.setText(edit.getText());
    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    public void afterTextChanged(Editable s) {

    }

}

