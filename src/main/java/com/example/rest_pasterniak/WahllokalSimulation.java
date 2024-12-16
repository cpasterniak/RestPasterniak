package com.example.rest_pasterniak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Simuliert Daten nach der Struktur von der Data Klasse
 */
public class WahllokalSimulation {

    public WahllokalSimulation() {}

    public WahllokalData getData(String inID) {
        WahllokalData data = new WahllokalData();
        data.setRegionID(inID);
        data.setFederalState("Austria");
        data.setRegionPostalCode("Wien");
        data.setRegionAddress("Bahnhofsstrasse 27/9");
        data.setRegionName("Wien Hbf");

        Random generator = new Random();

        // Parteien einer Liste hinzufügen und eine zufällige Anzahl von Stimmen mit einer Liste von "prefferdVotes"
        List<PartyVotes> votes = Arrays.asList(
                new PartyVotes("OEVP", generator.nextInt(100, 300), prefferdVotes()),
                new PartyVotes("FPOE", generator.nextInt(500, 1000), prefferdVotes()),
                new PartyVotes("SPOE", generator.nextInt(400, 700), prefferdVotes()),
                new PartyVotes("GRUENE", generator.nextInt(200, 300), prefferdVotes())

        );

        data.setStimmen(votes);

        return data;
    }

    /**
     * Erstellt eine Liste von Vorzugsstimmen mit zufälliger Anzahl an Stimmen.
     * @return gibt die Liste von den Vorzugsstimmen zurück
     */
    public List<PreferredMemberVotes> prefferdVotes() {
        Random generator = new Random();
        List<PreferredMemberVotes> votes = new ArrayList<>();
        votes.add(new PreferredMemberVotes(1, "Max Mustermann", generator.nextInt(10, 30)));
        votes.add(new PreferredMemberVotes(2, "Lisa Kauffrau", generator.nextInt(20, 50)));
        votes.add(new PreferredMemberVotes(3, "Bernhard Meister", generator.nextInt(70, 100)));

        return votes;
    }
}
