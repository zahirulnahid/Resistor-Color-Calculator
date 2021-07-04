package com.example.resistorcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button br4, br5, br6, aboutMe,rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        br4 = findViewById(R.id.bands4);
        br5 = findViewById(R.id.bands5);
        br6 = findViewById(R.id.bands6);
        rc= findViewById(R.id.ResistanceCalculate);
        aboutMe = findViewById(R.id.aboutMe);
        br4.setOnClickListener(this);
        br5.setOnClickListener(this);
        br6.setOnClickListener(this);
        aboutMe.setOnClickListener(this);
        rc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bands4:
                Intent intent = new Intent(getApplicationContext(), bandsResistor.class);
                startActivity(intent);
                break;
            case R.id.bands5:
                Intent intent2 = new Intent(getApplicationContext(), bands5Resistor.class);
                startActivity(intent2);
                break;
            case R.id.bands6:
                Intent intent3 = new Intent(getApplicationContext(), band6Resistor.class);
                startActivity(intent3);
                break;
            case R.id.aboutMe:
                Intent intent4 = new Intent(getApplicationContext(), aboutMe.class);
                startActivity(intent4);
                break;
            case R.id.ResistanceCalculate:
                Intent intent5 = new Intent(getApplicationContext(), resistance.class);
                startActivity(intent5);
                break;

        }
    }
}