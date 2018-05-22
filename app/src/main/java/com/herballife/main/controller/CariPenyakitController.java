package com.herballife.main.controller;

import com.herballife.main.model.CatalogModel;
import com.herballife.main.model.StaticData;

import java.util.ArrayList;

/**
 * Created by Misbahul Ardani on 5/22/2018.
 */

public class CariPenyakitController {
    private StaticData staticData = new StaticData();

    public String[] getSaran() {
        return staticData.getSaran();
    }
}
