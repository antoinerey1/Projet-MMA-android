package fr.mma.karatemanager;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mitch on 20/04/2017.
 */

public class AddCompetitionActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_competition);

    }
    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    public void onClick(View view) {

        EditText nom = (EditText) findViewById(R.id.editCompet);
        EditText date = (EditText) findViewById(R.id.editDate);
        EditText place = (EditText) findViewById(R.id.editLieux);
        EditText result = (EditText) findViewById(R.id.editScore);

        switch (view.getId()) {
            case (R.id.addButton):
                if (!nom.getText().toString().isEmpty() && !date.getText().toString().isEmpty() && !place.getText().toString().isEmpty() && !result.getText().toString().isEmpty() ) {
Competition competition = new Competition();
                    competition.setName(nom.getText().toString());
                    competition.setLocation(place.getText().toString());
                    competition.setScore(result.getText().toString());
                    competition.setDate(date.getText().toString());


                   DbUtil dbUtils = new DbUtil(this);
                    dbUtils.insertInTableCompetition(competition);
                    Toast.makeText(this,"Sauvegarde ok!", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"Formulaire incomplet!", Toast.LENGTH_LONG).show();
                }
        }

    }
}
