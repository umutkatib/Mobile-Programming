package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnConvertor;
    Button btnRandom;
    Button btnSms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvertor = findViewById(R.id.btn_convertor);
        btnRandom = findViewById(R.id.btn_random);
        btnSms = findViewById(R.id.btn_sms);



        btnConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                btnConvertor.startAnimation(animation);

                Intent i = new Intent(MainActivity.this, ConvertorActivity.class);
                startActivity(i);
            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                btnSms.startAnimation(animation);

                Intent i = new Intent(MainActivity.this, SmsActivity.class);
                startActivity(i);
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                btnRandom.startAnimation(animation);

                Intent i = new Intent(MainActivity.this, RandomActivity.class);
                startActivity(i);
            }
        });

    }
}