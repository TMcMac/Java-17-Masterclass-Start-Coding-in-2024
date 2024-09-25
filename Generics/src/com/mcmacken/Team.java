package com.mcmacken;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    // This is where we get truly generic with T being our so we can type
    // things as they come into this class, and by having T extend player parameterized T must be a player
    // or subtype of player, player can be a class or an interface, this establishes an upper bound on types that may
    // be used with this class
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    int totalWins = 0;
    int totalLoses = 0;
    int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLoses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            message = "we beat";
            totalWins++;
        } else if (theirScore > ourScore) {
            message = "lost to";
            totalLoses++;
        } else {
            message = "tied";
            totalTies++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
