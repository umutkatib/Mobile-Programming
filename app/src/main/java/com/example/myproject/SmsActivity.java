package com.example.myproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    EditText edtTel, edtMsj;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        edtTel = findViewById(R.id.edt_number);
        edtMsj = findViewById(R.id.edt_message);
        btnGonder = findViewById(R.id.btn_gonder);


        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(SmsActivity.this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    sendMessage();
                } else {
                    ActivityCompat.requestPermissions(SmsActivity.this, new String[] {Manifest.permission.SEND_SMS}, 100);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 100 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        } else {
            Toast.makeText(this, "İzin verilmedi!", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendMessage() {
        String phone = edtTel.getText().toString();
        String message = edtMsj.getText().toString();

        if(!phone.isEmpty() && !message.isEmpty()) {
            android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
            smsManager.sendTextMessage(phone, null, message, null, null);
            Toast.makeText(this, "SMS başarıyla gönderildi!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Lütfen telefon ve mesaj giriniz!", Toast.LENGTH_SHORT).show();
        }
    }
}