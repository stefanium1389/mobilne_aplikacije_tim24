package com.example.uberapptim24.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.mock.RideMock;
import com.example.uberapptim24.model.Ride;

public class DriverRideDetailsActivity extends AppCompatActivity {

    Intent intent;
    Toolbar toolbar;
    TextView driverTW;
    TextView passengerTW;
    TextView startLocTW;
    TextView endLocTW;
    TextView rideLenTW;
    TextView startTimeTW;
    TextView endTimeTW;
    TextView ratingTW;
    TextView commentTW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_ride_details);
        Ride ride = RideMock.getMockRides().get(0);

        toolbar = findViewById(R.id.toolbar_driver);//custom toolbar
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.ride_details);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true); //show the button
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back_icon);
        }

        intent = getIntent();

        driverTW = findViewById(R.id.driver_ride_details_driver);
        driverTW.append(intent.getExtras().getString("driver"));
        passengerTW = findViewById(R.id.driver_ride_details_passenger);
        passengerTW.append((intent.getExtras().getString("passenger")));
        startLocTW = findViewById(R.id.driver_ride_details_start_loc);
        startLocTW.append(intent.getExtras().getString("startLocation"));
        endLocTW = findViewById(R.id.driver_ride_details_end_loc);
        endLocTW.append(intent.getExtras().getString("endLocation"));
        rideLenTW = findViewById(R.id.driver_ride_details_length);
        rideLenTW.append(String.valueOf(intent.getExtras().getInt("rideLength")));
        startTimeTW = findViewById(R.id.driver_ride_details_start_time);
        startTimeTW.append(intent.getExtras().getString("startTime"));
        endTimeTW = findViewById(R.id.driver_ride_details_end_time);
        endTimeTW.append(intent.getExtras().getString("endTime"));
        ratingTW = findViewById(R.id.driver_ride_details_rating);
        ratingTW.append(String.valueOf(intent.getExtras().getInt("rating")));
        commentTW = findViewById(R.id.driver_ride_details_comment);
        commentTW.append(intent.getExtras().getString("comment"));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);

    }
}