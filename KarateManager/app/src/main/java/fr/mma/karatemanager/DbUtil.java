package fr.mma.karatemanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Asus on 20/04/2017.
 */

public class DbUtil {

    private DbAccess dbAccess;
    public DbUtil(Context context)
    {
        this.dbAccess = new DbAccess(context);
    }

    private void insertInTableFighting(String opponent, int points,int  opponent_points, int id_competition) {
        dbAccess.GetDb().execSQL("INSERT INTO fighting (opponent, points, opponent_points, id_competition) VALUES (?,?,?,?)", new Object[]{opponent, points, opponent_points, id_competition});
    }
    private void insertInTableCompetition(String name, String fdate, String location, String result) {
        dbAccess.GetDb().execSQL("INSERT INTO competition (name, fdate, location, result)) VALUES (?,?,?,?)",new Object[]{name, fdate, location, result});
    }
}
