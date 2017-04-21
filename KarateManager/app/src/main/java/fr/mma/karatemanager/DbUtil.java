package fr.mma.karatemanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Asus on 20/04/2017.
 */

public class DbUtil {

    private static DbUtil dbUtils;
    private DbAccess dbAccess;

    public DbUtil(Context context)
    {
        this.dbAccess = new DbAccess(context);
    }

    public static DbUtil getInstance() {
        return dbUtils;
    }


    public void insertInTableFighting(Fighting fighting) {
        dbAccess.GetDb().execSQL("INSERT INTO fighting (opponent, points, opponent_points, id_competition) VALUES (?,?,?,?)", new Object[]{fighting.getOpponent(), fighting.getPoints(), fighting.getOpponent_points(), fighting.getCompetition()});
    }
    public void insertInTableCompetition(Competition competition) {
        dbAccess.GetDb().execSQL("INSERT INTO competition (name, fdate, location, result)) VALUES (?,?,?,?)",new Object[]{competition.getName(), competition.getDate(), competition.getLocation(), competition.getScore()});
    }
    public void deleteAllFight(){
        dbAccess.GetDb().execSQL("DELETE * FROM fighting");
    }
    public void deleteFight(Fighting fighting){
        dbAccess.GetDb().execSQL("DELETE * FROM fighting WHERE id = ?",new Object[]{fighting.getId()});
    }
    public void deleteAllCompetition(){
        dbAccess.GetDb().execSQL("DELETE * FROM competition");
    }
    public void deleteCompetition(Fighting fighting,Competition competition){
        dbAccess.GetDb().execSQL("DELETE * FROM fighting WHERE id_competition = ?", new Object[]{fighting.getCompetition()});
        dbAccess.GetDb().execSQL("DELETE * FROM competition WHERE id = ?", new Object[]{competition.getId()});
    }
public void selectFight(Fighting fighting){
    dbAccess.GetDb().execSQL("SELECT * FROM fighting WHERE id =?",new Object[]{fighting.getId()});

}
public ArrayList selectAllFights(){
    Cursor c = dbAccess.GetDb().rawQuery("SELECT * c FROM fighting",null);
    int i =0;
   ArrayList <Fighting> fight = new ArrayList();
    if(c.moveToFirst()) {
        do {
        Fighting fighting = new Fighting();
            fighting.setId(c.getInt(0));
            fighting.setOpponent(c.getString(1));
            fighting.setPoints(c.getInt(2));
            fighting.setOpponent_points(c.getInt(3));
            fighting.setId_competition(c.getInt(4));
            fight.add(fighting);

        } while (c.moveToNext());
    }else {
        c.close();
    }
return fight;
}
public void selectCompetition(Competition competition){
    dbAccess.GetDb().execSQL("SELECT * FROM competition WHERE id =?", new Object[]{competition.getId()});
}
    public ArrayList selectAllCompetition(){
        Cursor c = dbAccess.GetDb().rawQuery("SELECT * c FROM competition",null);
        int i =0;
        ArrayList <Competition> compet= new ArrayList();
        if(c.moveToFirst()) {
            do {
                Competition competition = new Competition();
                competition.setId(c.getInt(0));
                competition.setName(c.getString(1));
                competition.setDate(c.getString(2));
                competition.setLocation(c.getString(3));
                competition.setScore(c.getString(4));
                compet.add(competition);

            } while (c.moveToNext());
        }else {
            c.close();
        }
        return compet;
    }
}
