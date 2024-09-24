package com.mcmacken;

record BaseballPlayer(String name, String position) {}

public class Main {
    public static void main(String[] args) {
        BaseballTeam cubs = new BaseballTeam("Chicago Cubs");
        BaseballTeam tigers = new BaseballTeam("Detroit Tigers");
        BaseballTeam giants = new BaseballTeam("San Francisco Giants");
        BaseballTeam yankees = new BaseballTeam("New York Yankees");

        scoreResult(tigers, 7, yankees, 2);

        var skubal= new BaseballPlayer("Tarik Skubal", "pitcher");
        var torkelson= new BaseballPlayer("Spencer Torkelson", "first base");
        tigers.addTeamMember(skubal);
        tigers.addTeamMember(torkelson);
        tigers.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
