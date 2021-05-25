package com.example.Medikit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.abproductions.R;

public class All_Set extends AppCompatActivity {
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__set);

        signin = findViewById(R.id.btn_all_set);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_signin();
            }
        });
    }
    public void activity_signin() {
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
    }
}