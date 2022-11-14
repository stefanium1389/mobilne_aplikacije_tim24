package com.example.uberapptim24.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.uberapptim24.R;

public class PassengerRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_register);

        Button buttonRegister = findViewById(R.id.passenger_register_button);
        buttonRegister.setOnClickListener(v ->
        {
            startActivity(new Intent(PassengerRegisterActivity.this, PassengerMainActivity.class));
        });
    }
}