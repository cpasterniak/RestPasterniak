package com.example.rest_pasterniak;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WahllokalController {

    @RequestMapping("/")
    public String wahllokalmain() {
        return "<h1>Wahllokal</h1>";
    }

    @RequestMapping("/{inID}")
    public WahllokalData wohllokaljson(@PathVariable String inID) {
        return new WahllokalSimulation().getData(inID);
    }

}
