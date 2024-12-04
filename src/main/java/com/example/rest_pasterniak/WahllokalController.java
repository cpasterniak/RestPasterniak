package com.example.rest_pasterniak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WahllokalController {

    @Autowired
    WahllokalService service = new WahllokalService();

    @RequestMapping("/s")
    public String wahllokalmain() {
        return "<h1>Wahllokal</h1>";
    }

    @RequestMapping(path = "/{inID}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public WahllokalData wohllokaljson(@PathVariable String inID) {
        return service.getWahllokalData(inID);
    }

    @RequestMapping(value = "/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public WahllokalData wohllokalxml(@PathVariable String inID) {
        return service.getWahllokalData(inID);
    }

}
