package com.herballife.main;


import android.app.Activity;
import android.app.AlertDialog;

import android.media.Image;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.herballife.main.controller.MainController;

public class MainActivity extends Activity implements OnClickListener {

    private MainController mainController = new MainController();
    private ImageView searchButton, catalogButton, helpButton, exitButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = (ImageView) findViewById(R.id.btn_search);
        catalogButton = (ImageView) findViewById(R.id.btn_catalog);
        helpButton = (ImageView) findViewById(R.id.btn_help);
        exitButton = (ImageView) findViewById(R.id.btn_exit);

        searchButton.setOnClickListener(this);
        catalogButton.setOnClickListener(this);
        helpButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_search:
                Intent btn_search = new Intent(this, List.class);
                startActivity(btn_search);
                break;
            case R.id.btn_catalog:
                Intent btn_catalog = new Intent(this, List_catalog.class);
                startActivity(btn_catalog);
                break;
            case R.id.btn_help:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(mainController.getHelp())
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog judul = builder.create();
                judul.setIcon(R.drawable.help);
                judul.setTitle("Help");
                judul.show();
                break;
            case R.id.btn_exit:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setMessage("Apakah anda benar-benar ingin keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Ya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.this.finish();
                            }
                        });
                AlertDialog judul2 = builder2.create();
                judul2.setIcon(R.drawable.exit);
                judul2.setTitle("Exit");
                judul2.show();
                break;
        }
    }

}