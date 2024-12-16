package com.example.rest_pasterniak;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

/**
 * Attribute sind Daten von Parteien als Liste
 */
@XmlRootElement
public class PartyVotes {
    private String partyName;
    private int votes;
    private List<PreferredMemberVotes> preferredMemberVotes;

    public PartyVotes(String partyName, int votes, List<PreferredMemberVotes> preferredMemberVotes) {
        setPartyName(partyName);
        setVotes(votes);
        setPreferredMemberVotes(preferredMemberVotes);
    }

    @XmlElement
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @XmlElement
    public int getVotes() {
        return votes;
    }


    public void setVotes(int votes) {
        this.votes = votes;
    }

    @XmlElement(name="Vorugsstimmen")
    public List<PreferredMemberVotes> getPreferredMemberVotes() {
        return preferredMemberVotes;
    }

    public void setPreferredMemberVotes(List<PreferredMemberVotes> preferredMemberVotes) {
        this.preferredMemberVotes = preferredMemberVotes;
    }
}
