package com.herballife.main.controller;

import android.content.Context;

import com.herballife.main.model.CatalogModel;

import java.util.ArrayList;

public class CatalogController {
    private ArrayList<String> catalogNames;
    private CatalogModel catalogModel;

    public CatalogController(Context context) {
        catalogModel = new CatalogModel(context);
    }

    public ArrayList<String> getCatalogNames() {
        return catalogModel.getCatalogNames();
    }
}
