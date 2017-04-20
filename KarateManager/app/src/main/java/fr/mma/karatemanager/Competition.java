package fr.mma.karatemanager;

/**
 * Created by mamar on 20/04/2017.
 */

public class Competition {

    private int id;
    private String name;
    private String location;
    private String scrore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScrore() {
        return scrore;
    }

    public void setScrore(String scrore) {
        this.scrore = scrore;
    }
}
