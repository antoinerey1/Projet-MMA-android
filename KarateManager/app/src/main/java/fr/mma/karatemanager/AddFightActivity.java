package fr.mma.karatemanager;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mitch on 20/04/2017.
 */

public class AddFightActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_fight);
    }

    public void onClick(View view) {

        EditText compet = (EditText) findViewById(R.id.autocompleteCompet);
        EditText opponent = (EditText) findViewById(R.id.editOpponent);
        EditText scoreperso = (EditText) findViewById(R.id.editScorePerso);
        EditText scoreopp = (EditText) findViewById(R.id.editScoreOpponent);

        switch (view.getId()) {
            case (R.id.addButtonFight):
                if (!compet.getText().toString().isEmpty() && !opponent.getText().toString().isEmpty() && !scoreperso.getText().toString().isEmpty() && !scoreopp.getText().toString().isEmpty() ) {
                    Fighting fighting = new Fighting();
                    fighting.setId_competition(Integer.parseInt(compet.getText().toString()));
                    fighting.setOpponent(opponent.getText().toString());
                    fighting.setPoints(Integer.parseInt(scoreperso.getText().toString()));
                    fighting.setOpponent_points(Integer.parseInt(scoreopp.getText().toString()));



                    DbUtil dbUtils = new DbUtil(this);
                    dbUtils.insertInTableFighting(fighting);
                    Toast.makeText(this,"Sauvegarde ok!", Toast.LENGTH_LONG).show();
                    break;
                }else {
                    Toast.makeText(this,"Formulaire incomplet!", Toast.LENGTH_LONG).show();
                    break;
                }
        }

    }
}
