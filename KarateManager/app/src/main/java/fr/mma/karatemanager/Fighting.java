package fr.mma.karatemanager;

/**
 * Created by mamar on 20/04/2017.
 */

public class Fighting {
    private int id;
    private Competition competition;
    private int points;
    private int opponent_points;
    private String opponent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setId_competition(Competition competition) {
        this.competition = competition;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getOpponent_points() {
        return opponent_points;
    }

    public void setOpponent_points(int opponent_points) {
        this.opponent_points = opponent_points;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }
}
