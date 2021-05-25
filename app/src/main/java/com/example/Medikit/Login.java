package com.example.Medikit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.abproductions.R;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    private Button loginproceed, CallSignUp;
    Button callSignUp;
    Animation welcome_animation2;
    TextView greet2;
    public
    EditText ed_txt_1;
    String str_1;
    Button b;

    Spinner spinner;
    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        spinner= findViewById(R.id.spinner);

        list.add("Admin");
        list.add("Doctor");
        list.add("Attendant");
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(arrayAdapter);
        callSignUp = findViewById(R.id.btnSignUp);
        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_SignUp();
            }
        });

        ed_txt_1 = findViewById(R.id.username);
        b = findViewById(R.id.btnproceed);

        loginproceed = findViewById(R.id.btnproceed);
        welcome_animation2 = AnimationUtils.loadAnimation(this, R.anim.welcome_animation2);
        greet2 = findViewById(R.id.txtslogonname);
        greet2.setAnimation(welcome_animation2);

    }

    public void register_data(View v){
        str_1 = ed_txt_1.getText().toString();
        Intent open_dashboard = new Intent(this,Proceed.class);
        open_dashboard.putExtra("keyword" , spinner.getSelectedItem().toString());
        startActivity(open_dashboard);
    }
    public void activity_Proceed()
    {
        Intent intent = new Intent(this, Proceed.class);
        startActivity(intent);
    }
    public void activity_SignUp()
    {
        Intent intent = new Intent (Login.this, Sign_up.class);
        startActivity(intent);
    }
}