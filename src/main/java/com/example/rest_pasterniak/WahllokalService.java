package com.example.rest_pasterniak;

import org.springframework.stereotype.Service;

@Service
public class WahllokalService {
    public WahllokalData getWahllokalData(String inID) {
        WahllokalSimulation sim = new WahllokalSimulation();
        return sim.getData(inID);
    }
}
