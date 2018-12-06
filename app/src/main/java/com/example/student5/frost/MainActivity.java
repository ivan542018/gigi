package com.example.student5.frost;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void do2(View v) {
        ConstraintLayout cl1 = findViewById(R.id.Root);
        cl1.setBackgroundColor(Color.RED);


    }
}