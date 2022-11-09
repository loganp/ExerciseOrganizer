package com.example.exerciseorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnHandler(View v) {

        if (v.getId() == R.id.btnViewWorkouts){
            Intent i = new Intent(this, WorkoutsActivity.class);
            i.putExtra("name", "value");
            startActivity(i);
        }
        Button b = (Button) v;
        if (b.getText() == "Logan is Great")
            b.setText("Button");
        else b.setText("Logan is Great");

        //TextView tv = findViewById(R.id.btnViewWorkouts);



    }

}