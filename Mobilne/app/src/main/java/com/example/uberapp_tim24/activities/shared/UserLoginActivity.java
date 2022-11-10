package com.example.uberapp_tim24.activities.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uberapp_tim24.R;
import com.example.uberapp_tim24.activities.driver.DriverMainActivity;
import com.example.uberapp_tim24.activities.passenger.PassengerRegisterActivity;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Button loginButton = findViewById(R.id.login_button);
        Button registerButton = findViewById(R.id.register_button);
        loginButton.setOnClickListener(new View.OnClickListener() { // login dugme akcija
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLoginActivity.this, DriverMainActivity.class);
                startActivity(intent);
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() { // register dugme akcija
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLoginActivity.this, PassengerRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}