package fr.mma.karatemanager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DbAccess extends SQLiteOpenHelper {

    private static final String DBNAME = "karate";

    public DbAccess (Context context)
    {
        super(context , DbAccess.DBNAME ,null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE fighting(id int (11) Auto_increment  NOT NULL , opponent Varchar (50) NOT NULL , points Int NOT NULL , opponent_points Int NOT NULL , id_competition  Int NOT NULL , PRIMARY KEY (id ))");
        db.execSQL("CREATE TABLE competition(id int (11) Auto_increment  NOT NULL , name Varchar (25) NOT NULL , fdate Date NOT NULL , location Varchar (25) , result   Varchar (25) , PRIMARY KEY (id ))");
        db.execSQL("ALTER TABLE fighting ADD CONSTRAINT FK_fighting_id_competition FOREIGN KEY (id_competition) REFERENCES competition(id)");

    }

    public SQLiteDatabase GetDb()
    {
        return this.getWritableDatabase();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
