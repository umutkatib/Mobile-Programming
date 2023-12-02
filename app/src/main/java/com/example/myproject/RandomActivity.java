package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    EditText adet, maks, min;
    ProgressBar prg_1, prg_2, prg_3;
    TextView tv_1, tv_2, tv_3;
    TextView tv_1_a, tv_1_b, tv_2_a, tv_2_b, tv_3_a, tv_3_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        adet = findViewById(R.id.edt_adet);
        maks = findViewById(R.id.edt_maks);
        min = findViewById(R.id.edt_min);

        prg_1 = findViewById(R.id.prg_1);
        prg_2 = findViewById(R.id.prg_2);
        prg_3 = findViewById(R.id.prg_3);

        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_3 = findViewById(R.id.tv_3);

        tv_1_a = findViewById(R.id.tv_1_a);
        tv_1_b = findViewById(R.id.tv_1_b);
        tv_2_a = findViewById(R.id.tv_2_a);
        tv_2_b = findViewById(R.id.tv_2_b);
        tv_3_a = findViewById(R.id.tv_3_a);
        tv_3_b = findViewById(R.id.tv_3_b);



    }
}