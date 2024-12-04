package com.example.rest_pasterniak;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.text.SimpleDateFormat;
import java.util.*;

@XmlRootElement(name = "electionData")
public class WahllokalData {
    private String regionID;
    private String regionName;
    private String regionAddress;
    private String regionPostalCode;
    private String federalState;
    private String timeStamp;
    private List<PartyVotes> stimmen;

    public WahllokalData() {
        this.timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        this.stimmen = new ArrayList<>();
    }

    @XmlElement
    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    @XmlElement
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @XmlElement
    public String getRegionAddress() {
        return regionAddress;
    }

    public void setRegionAddress(String regionAddress) {
        this.regionAddress = regionAddress;
    }

    @XmlElement
    public String getRegionPostalCode() {
        return regionPostalCode;
    }

    public void setRegionPostalCode(String regionPostalCode) {
        this.regionPostalCode = regionPostalCode;
    }

    @XmlElement
    public String getFederalState() {
        return federalState;
    }

    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    @XmlElement
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @XmlElement(name="Stimmen")
    public List<PartyVotes> getStimmen() {
        return stimmen;
    }

    public void setStimmen(List<PartyVotes> partyVotes) {
        this.stimmen = partyVotes;
    }

    @Override
    public String toString() {
        return "WahllokalData [regionID=" + regionID + ", regionName=" + regionName + ", regionAddress=" + regionAddress + ", regionPostalCode=";
    }
}
