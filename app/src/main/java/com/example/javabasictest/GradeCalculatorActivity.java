package com.example.javabasictest;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GradeCalculatorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_calculator);

        Button calculateButton = findViewById(R.id.calculateButton);
        EditText gradeText = findViewById(R.id.grade);
        EditText weightText = findViewById(R.id.weight);
        TextView resultText = findViewById(R.id.result);

        resultText.setText(getString(R.string.result, 0.0));
        calculateButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("BUTTONS", "User tapped the button using Java!");
                String stringValue;
                Double grade = 0.0;
                Double weight = 0.0;
                stringValue = gradeText.getText().toString();
                if (!stringValue.equals(""))
                    grade = Double.parseDouble(stringValue);
                stringValue = weightText.getText().toString();
                if (!stringValue.equals(""))
                    weight = Double.parseDouble(stringValue);

                Double result = 0.0;
                if (grade != 0.0 && weight != 0.0)
                    result = grade * (weight/100);
                resultText.setText(getString(R.string.result, result));

            }
        });
    }
}
