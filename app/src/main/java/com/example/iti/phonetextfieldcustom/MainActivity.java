package com.example.iti.phonetextfieldcustom;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    PhoneComponent phoneComponent;
    PhoneText phoneText;
    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneComponent = findViewById(R.id.phoneComponent);
        phoneText = findViewById(R.id.phoneText);
        btnOK = findViewById(R.id.btnOk);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,phoneText.getPhone(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
