package fr.mma.karatemanager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mitch on 20/04/2017.
 */

public class CompetitionListActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competition_list);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layoutCompet);
        DbUtil.getInstance().selectAllCompetition();
        for( Competition competition : DbUtil.getInstance().selectAllCompetition()) {
            String s = competition.getName() +" - "+competition.getLocation() +" - "+competition.getScore() +" - "+competition.getDate()+"\n";
            TextView tv = new TextView(null);
            tv.setText(s);
            layout.addView(tv);
        }
    }


}
