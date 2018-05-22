package com.herballife.main.controller;

import android.content.Context;

import com.herballife.main.model.CatalogModel;

import java.util.ArrayList;

/**
 * Created by Misbahul Ardani on 5/22/2018.
 */

public class PenyakitController {
    private ArrayList<String> penyakitNames;
    private CatalogModel mCatalogModel;

    public PenyakitController(Context context) {
        mCatalogModel = new CatalogModel(context);
    }

    public ArrayList<String> getPenyakitNames() {
        return mCatalogModel.getPenyakitNames();
    }
}
