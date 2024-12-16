package com.example.rest_pasterniak;

import org.springframework.stereotype.Service;

/**
 * erstellt ein Simulationsobjekt wird in diesem Beispiel nicht gebraucht, weil es zu einfach ist.
 */
@Service
public class WahllokalService {
    public WahllokalData getWahllokalData(String inID) {
        WahllokalSimulation sim = new WahllokalSimulation();
        return sim.getData(inID);
    }
}
