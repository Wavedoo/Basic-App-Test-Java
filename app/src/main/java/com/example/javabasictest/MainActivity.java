package com.example.javabasictest;

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
        setContentView(R.layout.activity_main);

        Button calculateButton = (Button) findViewById(R.id.calculateButton);
        EditText gradeText = (EditText) findViewById(R.id.grade);
        EditText weightText = (EditText) findViewById(R.id.weight);
        TextView resultText = (TextView) findViewById(R.id.result);

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