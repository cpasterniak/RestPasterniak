package com.example.rest_pasterniak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

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

        List<PartyVotes> votes = Arrays.asList(
                new PartyVotes("OEVP", generator.nextInt(100, 300), prefferdVotes()),
                new PartyVotes("FPOE", generator.nextInt(500, 1000), prefferdVotes()),
                new PartyVotes("SPOE", generator.nextInt(400, 700), prefferdVotes()),
                new PartyVotes("GRUENE", generator.nextInt(200, 300), prefferdVotes())

        );



        data.setStimmen(votes);

        return data;
    }

    public List<PreferredMemberVotes> prefferdVotes() {
        Random generator = new Random();
        List<PreferredMemberVotes> votes = new ArrayList<>();
        votes.add(new PreferredMemberVotes(1, "Max Mustermann", generator.nextInt(10, 30)));
        votes.add(new PreferredMemberVotes(2, "Lisa Kauffrau", generator.nextInt(20, 50)));
        votes.add(new PreferredMemberVotes(3, "Bernhard Meister", generator.nextInt(70, 100)));

        return votes;
    }
}
