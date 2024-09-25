package com.mcmacken;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    // This is intentionally more generic than baseball team so that we can have multiple sports
    // But there is an issue here, without typing we can add players from the any sport to our team
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    int totalWins = 0;
    int totalLoses = 0;
    int totalTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
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
