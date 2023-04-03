package com.example.javabasictest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoBackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.go_back);

        Button back = findViewById(R.id.back);
        Button prank = findViewById(R.id.prank);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        prank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prank.setText(getString(R.string.prank_2));
            }
        });
    }
}
