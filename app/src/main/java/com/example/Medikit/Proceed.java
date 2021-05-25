package com.example.Medikit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.abproductions.R;

public class Proceed extends AppCompatActivity {

    TextView txt1;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);
        txt1 = findViewById(R.id.username);
        s1 = getIntent().getStringExtra("keyword");
        txt1.setText(s1);
    }
}