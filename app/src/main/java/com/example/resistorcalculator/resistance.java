package com.example.resistorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class resistance extends AppCompatActivity {
    Button button;
    RadioButton genderradioButton;
    RadioGroup radioGroup;
    EditText voltage, current, resistance;
    TextView message;
    float v, i, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistance);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        resistance = findViewById(R.id.resistance);
        message = findViewById(R.id.message);
    }

    public void onclickbuttonMethod(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        genderradioButton = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            String title = genderradioButton.getText().toString();
            String valRes = resistance.getText().toString();

            if (title.charAt(0) == 'S') {
                if(valRes.length()>0)stringSpilt(resistance.getText().toString(), 0);
            }
            if (title.charAt(0) == 'P') {
                if(valRes.length()>0)stringSpilt(resistance.getText().toString(), 1);
            }
        }


    }

    public float stringSpilt(String currentString, int type) {
        String[] separated = currentString.split(",");
        float resistanceVal[] = new float[separated.length];
        for (int i = 0; i < separated.length; i++) {
            resistanceVal[i] = Float.parseFloat(separated[i]);
        }
        float sumOfResistance = 0;

        //Series
        if (type == 0) {
            for (int i = 0; i < separated.length; i++) {
                sumOfResistance += resistanceVal[i];
            }
        }
        //Parallel
        if (type == 1) {
            for (int i = 0; i < separated.length; i++) {
                sumOfResistance += (1 / resistanceVal[i]);
            }
            sumOfResistance = 1 / sumOfResistance;
        }
        String mess = "The Resistance:" + sumOfResistance;
        message.setText(mess);

        return sumOfResistance;
    }


}