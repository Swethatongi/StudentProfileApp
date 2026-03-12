package com.example.studentprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 * MainActivity Class
 * This activity displays the student profile.
 * It also handles the button click event to show
 * a Toast message containing profile details.
 */

public class MainActivity extends AppCompatActivity {

    // Declare button variable
    Button detailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // onCreate() is called when the activity is created
        super.onCreate(savedInstanceState);

        // Connect this Java file to XML layout
        setContentView(R.layout.activity_main);

        // Link the button from XML to Java
        detailsButton = findViewById(R.id.detailsButton);

        // Button Click Listener
        detailsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // Display a Toast message when button is clicked
                Toast.makeText(
                        MainActivity.this,
                        "Student Profile Details Displayed",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}