package com.herballife.main.controller;

import android.content.Context;

import com.herballife.main.model.CatalogModel;
import com.herballife.main.model.Tumbuhan;

/**
 * Created by Misbahul Ardani on 5/22/2018.
 */

public class DetailCatalogController {
    private Tumbuhan tumbuhan;
    private CatalogModel catalogModel;

    public DetailCatalogController(Context context) {
        catalogModel = new CatalogModel(context);
    }

    public Tumbuhan getTumbuhan(String q) {
        return catalogModel.getTumbuhan(q);
    }
}
