package com.example.Medikit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.abproductions.R;

public class Sign_up extends AppCompatActivity {
    private Button back_to_login, Sign_Up_Proceed;
    TextView greet3;
    Animation welcome_animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        back_to_login = findViewById(R.id.back_to_login);
        back_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_back_to_Proceed();
            }
        });
        Sign_Up_Proceed = findViewById(R.id.Sign_Up_Proceed);
        Sign_Up_Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_signup_Proceed();
            }

        });
        welcome_animation2 = AnimationUtils.loadAnimation(this, R.anim.welcome_animation2);
        greet3 = findViewById(R.id.txtslogonname);
        greet3.setAnimation(welcome_animation2);
    }
    public void activity_back_to_Proceed()
    {
        Intent intent = new Intent(Sign_up.this, Login.class);
        startActivity(intent);
    }
    public void activity_signup_Proceed()
    {
        Intent intent = new Intent(Sign_up.this, All_Set.class);
        startActivity(intent);
    }

}