package com.example.rest_pasterniak;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Vorzugsstimmen mit Attributen abgebildet
 */
@XmlRootElement
public class PreferredMemberVotes {
    private int index;
    private String name;
    private int votes;

    public PreferredMemberVotes(int index, String name, int votes) {
        this.index = index;
        this.name = name;
        this.votes = votes;
    }

    @XmlElement
    public int getIndex() {
        return index;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public int getVotes() {
        return votes;
    }
}
