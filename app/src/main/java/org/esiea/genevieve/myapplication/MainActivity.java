package org.esiea.genevieve.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sos_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sos_button = (Button ) findViewById(R.id.sos_button);
        sos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, ListEvents.class);  //Lancer l'activité listevents
                    startActivity(intent);    //Afficher la vue
                }

                //Toast.makeText(MainActivity.this,
                        //"Incident signalé!", Toast.LENGTH_LONG) .show();
            }
        );
    }
}
