package com.herballife.main.controller;

import android.content.Context;

import com.herballife.main.model.CatalogModel;
import com.herballife.main.model.Penyakit;

/**
 * Created by Misbahul Ardani on 5/22/2018.
 */

public class DetailPenyakitController {
    private Penyakit penyakit;
    private CatalogModel mCatalogModel;

    public DetailPenyakitController(Context context) {
        mCatalogModel = new CatalogModel(context);
    }

    public Penyakit getPenyakit(String q) {
        return mCatalogModel.getPenyakit(q);
    }
}
