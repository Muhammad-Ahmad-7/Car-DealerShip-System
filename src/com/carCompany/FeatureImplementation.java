package com.carCompany;

import java.util.ArrayList;

public class FeatureImplementation implements Feature{

    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void addFeature() {
        list.add("");
    }

    @Override
    public void removeFeature() {
        list.remove("");
    }
}
