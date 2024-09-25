package com.mcmacken;
interface Player {}
record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
        BaseballTeam cubs = new BaseballTeam("Chicago Cubs");
        BaseballTeam tigers = new BaseballTeam("Detroit Tigers");
        BaseballTeam giants = new BaseballTeam("San Francisco Giants");
        BaseballTeam yankees = new BaseballTeam("New York Yankees");

        SportsTeam wolverines = new SportsTeam("Michigan Wolverines");
        SportsTeam spatans = new SportsTeam("Michigan State Spartans");

        // By adding the player type to our generic we no prevent adding say a football player to a baseball team
        Team<BaseballPlayer> astros = new Team("Houston Astros");
        Team<BaseballPlayer> redSox = new Team("Boston Redsox");

        scoreResult(tigers, 7, yankees, 2);

        var skubal= new BaseballPlayer("Tarik Skubal", "pitcher");
        var torkelson= new BaseballPlayer("Spencer Torkelson", "first base");
        tigers.addTeamMember(skubal);
        tigers.addTeamMember(torkelson);
        tigers.listTeamMembers();

        scoreResult(wolverines, 35, spatans, 10);

        var orji = new FootballPlayer("Alex Orji", "Quarterback");
        var edwards = new FootballPlayer("Donovan Edwards", "Running Back");
        wolverines.addTeamMember(orji);
        wolverines.addTeamMember(edwards);
        wolverines.listTeamMembers();

        scoreResult(redSox, 5, astros, 3);
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
