package com.example.android.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView bouttonSignUp = (TextView) findViewById(R.id.link_login);

        // Set a click listener on that View
        bouttonSignUp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent acceuilIntent = new Intent(SignUpActivity.this, LoginActivity.class);

                // Start the new activity
                startActivity(acceuilIntent);
            }
        });

        Button signup = (Button) findViewById(R.id.signup_button);

        // Set a click listener on that View
        signup.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent acceuilIntent = new Intent(SignUpActivity.this, Acceuil.class);

                // Start the new activity
                startActivity(acceuilIntent);
            }
        });
    }
}

