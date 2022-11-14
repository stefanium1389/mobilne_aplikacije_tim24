package com.example.uberapptim24.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.adapters.MessageAdapter;

public class PassengerChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_chat);

        ListView listView = findViewById(R.id.passenger_chat_listview);
        MessageAdapter adapter = new MessageAdapter(this);
        listView.setAdapter(adapter);
    }
}