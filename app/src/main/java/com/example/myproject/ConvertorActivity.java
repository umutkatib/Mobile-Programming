package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvertorActivity extends AppCompatActivity {

    // decimals
    EditText edtDecimalInput;
    Button btnDecimal;
    TextView tvDecimalResult;


    // megabytes
    EditText edtMegabyteInput;
    Button btnMegabyte;
    TextView tvMegabyteResult;


    // celcius
    EditText edtCelciusInput;
    Button btnCelcius;
    TextView tvCelciusResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);


        // decimal click
        edtDecimalInput = findViewById(R.id.edt_decimal_input);
        btnDecimal = findViewById(R.id.btn_decimal);
        tvDecimalResult = findViewById(R.id.tv_decimal_result);

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalConvertor();
            }
        });




        // megabytes click
        edtMegabyteInput = findViewById(R.id.edt_megabyte_input);
        btnMegabyte = findViewById(R.id.btn_megabyte);
        tvMegabyteResult = findViewById(R.id.tv_megabyte_result);

        btnMegabyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MegabyteConvertor();
            }
        });



        // celcius click
        edtCelciusInput = findViewById(R.id.edt_celcius_input);
        btnCelcius = findViewById(R.id.btn_celcius);
        tvCelciusResult = findViewById(R.id.tv_celcius_result);

        btnCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CelciusConvertor();
            }
        });

    }

    private void DecimalConvertor() {
        String dec = edtDecimalInput.getText().toString();

        if (!dec.isEmpty()) {
            try {
                int decimal = Integer.parseInt(dec);

                String bin = Integer.toBinaryString(decimal);
                String oct = Integer.toOctalString(decimal);
                String hex = Integer.toHexString(decimal);

                tvDecimalResult.setText("BIN: " + bin + "\nOCT: " + oct + "\nHEX: " + hex);
            } catch (NumberFormatException e) {
                tvDecimalResult.setText("Geçersiz onluk sayı!");
            }
        } else {
            tvDecimalResult.setText("Onluk Sayı Giriniz!");
        }
    }

    private void MegabyteConvertor() {
        String megaByteText = edtMegabyteInput.getText().toString();

        if(!megaByteText.isEmpty()) {
            double megabyte = Double.parseDouble(megaByteText);

            double kiloByte = megabyte * 1024;
            double byteDegeri = kiloByte * 1024;
            double kibiByte = byteDegeri * 8;
            double bit = kibiByte * 1024;

            tvMegabyteResult.setText("KiloByte: " + kiloByte +
                                    "\nByte: " + byteDegeri +
                                    "\nKibiByte: " + kibiByte +
                                    "\nBit: " + bit);
        } else {
            tvMegabyteResult.setText("MegaByte değerini giriniz!");
        }
    }

    private void CelciusConvertor() {
        String celciusText = edtCelciusInput.getText().toString();

        if(!celciusText.isEmpty()) {
            double celcius = Double.parseDouble(celciusText);

            double fahrenheit = (celcius * 9 / 5) + 32;
            double kelvin = celcius + 273.15;

            tvCelciusResult.setText("Fahrenheit: " + fahrenheit + "\nKelvin: " + kelvin);
        } else {
            tvCelciusResult.setText("Sıcaklık değerini giriniz!");
        }
    }
}