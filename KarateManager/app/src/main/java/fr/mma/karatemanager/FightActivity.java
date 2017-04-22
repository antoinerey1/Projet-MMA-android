package fr.mma.karatemanager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.id;

/**
 * Created by Mitch on 20/04/2017.
 */

public class FightActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fights);

     /*   LinearLayout layout = (LinearLayout) findViewById(R.id.layoutFight);
        for (Fighting fighting : list) {
            String s = layout.getX() + " - " + fighting.getCompetition() +  fighting.getOpponent() + fighting.getPoints() + fighting.getOpponent_points() + "\n";
            TextView tv = new TextView(null);
            tv.setText(s);
            layout.addView(tv);
        }*/
    }
}

