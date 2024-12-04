package com.example.rest_pasterniak;

import java.util.List;

public class PartyVotes {
    private String partyName;
    private int votes;
    private List<PreferredMemberVotes> preferredMemberVotes;

    public PartyVotes(String partyName, int votes, List<PreferredMemberVotes> preferredMemberVotes) {
        setPartyName(partyName);
        setVotes(votes);
        setPreferredMemberVotes(preferredMemberVotes);
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public List<PreferredMemberVotes> getPreferredMemberVotes() {
        return preferredMemberVotes;
    }

    public void setPreferredMemberVotes(List<PreferredMemberVotes> preferredMemberVotes) {
        this.preferredMemberVotes = preferredMemberVotes;
    }
}
