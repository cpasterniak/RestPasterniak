package com.example.rest_pasterniak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Der Controller der mit HTTP arbeitet. Wird durch die Notation auch so von Spring interpretiert.
 */
@RestController
@RequestMapping("/")
public class WahllokalController {

    @Autowired
    WahllokalService service = new WahllokalService();

    @RequestMapping("/s")
    public String wahllokalmain() {
        return "<h1>Wahllokal</h1>";
    }

    /**
     * Zeigt die Daten aus Service an.
     * @param inID ist ein Parameter in der URL
     * @return die Daten aus der Simulation
     */
    @RequestMapping(path = "/{inID}", produces = MediaType.APPLICATION_JSON_VALUE) // Durch den MediaType wird die Anzeige bestimmt hier JSON
    @ResponseBody
    public WahllokalData wohllokaljson(@PathVariable String inID) { // inID ist in der URL ein Parameter
        for(PartyVotes votes : service.getWahllokalData(inID).getStimmen()) {
            System.out.println(votes);
        }
        return service.getWahllokalData(inID);
    }

    /**
     * Zeigt die Daten an nur als XML
     * @param inID ist ein Parameter in der URL
     * @return die Daten aus der Simulation
     */
    @RequestMapping(value = "/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE) // Durch den MediaType wird die Anzeige bestimmt hier XML
    @ResponseBody
    public WahllokalData wohllokalxml(@PathVariable String inID) {
        return service.getWahllokalData(inID);
    }

}
