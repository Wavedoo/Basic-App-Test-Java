package com.example.javabasictest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button gradeActivity = findViewById(R.id.grade_calculator);
        Button oopsActivity = findViewById(R.id.oops);

        gradeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gradeIntent = new Intent(view.getContext(), GradeCalculatorActivity.class);
                startActivity(gradeIntent);
            }
        });

        oopsActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent oopsIntent = new Intent(view.getContext(), GoBackActivity.class);
                startActivity(oopsIntent);
            }
        });
     }
}