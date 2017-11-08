package org.esiea.genevieve.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListEvents extends AppCompatActivity {

    Button validation_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_events);

        validation_button = (Button) findViewById(R.id.validation_button);
        validation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListEvents.this, Place.class); // Lancer l'activité Place
                startActivity(intent); //Afficher la vue
            }
        });
    }
}
