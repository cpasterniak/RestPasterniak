package com.example.rest_pasterniak;

public class WahllokalSimulation {

    public WahllokalSimulation() {}

    public WahllokalData getData(String inID) {
        WahllokalData data = new WahllokalData();
        data.setRegionID(inID);
        data.setFederalState("Austria");
        data.setRegionPostalCode("Wien");
        data.setRegionAddress("Bahnhofsstrasse 27/9");
        data.setRegionName("Wien Hbf");

        return data;
    }
}
