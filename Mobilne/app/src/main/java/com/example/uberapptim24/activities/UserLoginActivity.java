package com.example.uberapptim24.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uberapptim24.R;

public class UserLoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Button loginButton = findViewById(R.id.login_button);
        Button registerButton = findViewById(R.id.register_button);
        loginButton.setOnClickListener(new View.OnClickListener() { // login dugme akcija
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserLoginActivity.this, DriverMainActivity.class); // "nameravam da predjem iz this u pasenger main activity"
                startActivity(intent);
                finish();
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

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}