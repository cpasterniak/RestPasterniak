package com.example.rest_pasterniak;

public class PreferredMemberVotes {
    private int index;
    private String name;
    private int votes;

    public PreferredMemberVotes(int index, String name, int votes) {
        this.index = index;
        this.name = name;
        this.votes = votes;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }
}
