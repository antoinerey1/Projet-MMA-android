package fr.mma.karatemanager;

/**
 * Created by mamar on 20/04/2017.
 */

public class Fighting {
    private int id;
    private int id_competition;
    private int points;
    private int opponent_points;
    private String opponent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_competition() {
        return id_competition;
    }

    public void setId_competition(int id_competition) {
        this.id_competition = id_competition;
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
