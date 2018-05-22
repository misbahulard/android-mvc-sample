package com.herballife.main.controller;

import com.herballife.main.model.StaticData;

public class MainController {
    private StaticData staticData = new StaticData();

    public String getHelp() {
        return staticData.getHelp();
    }
}
