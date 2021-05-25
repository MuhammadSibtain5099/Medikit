package com.example.Medikit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.abproductions.R;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;

    //variables
    Animation welcome_animation;
    TextView greet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

    //Animations
   welcome_animation = AnimationUtils.loadAnimation(this, R.anim.welcome_animation);

    //Hooks
     greet = findViewById(R.id.txt_welcome);
     greet.setAnimation(welcome_animation);

     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent intent = new Intent(MainActivity.this, FirstActivity.class);
             startActivity(intent);
             finish();
         }
     },SPLASH_SCREEN);
    }
}