package com.example.uberapptim24.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uberapptim24.R;

public class PassengerRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_register);

        Button register = findViewById(R.id.passenger_register_button);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassengerRegisterActivity.this, PassengerMainActivity.class);
                startActivity(intent);
            }
        });
    }
}