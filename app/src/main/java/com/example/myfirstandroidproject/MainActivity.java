package com.example.myfirstandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        EditText inputOne = findViewById(R.id.input_number_one);
        EditText inputTwo = findViewById(R.id.input_number_two);
        Button compareButton = findViewById(R.id.button_compare);
        TextView result = findViewById(R.id.result);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer one = Integer.valueOf(inputOne.getText().toString());
                    Integer two = Integer.valueOf(inputTwo.getText().toString());

                    Log.v("MainActivity", "User input " + one + " and " + two);

                    if (one.equals(two)) {
                        result.setText("Equals");
                    } else {
                        result.setText("Not equals");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Incorrect input!");
                }
            }
        });

    }
}