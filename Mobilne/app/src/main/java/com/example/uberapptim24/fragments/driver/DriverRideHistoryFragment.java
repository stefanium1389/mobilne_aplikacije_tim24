package com.example.uberapptim24.fragments.driver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.uberapptim24.R;
import com.example.uberapptim24.activities.DriverMainActivity;
import com.example.uberapptim24.activities.DriverRideDetailsActivity;
import com.example.uberapptim24.adapters.RideAdapter;
import com.example.uberapptim24.mock.RideMock;
import com.example.uberapptim24.model.Ride;

import java.util.Objects;

public class DriverRideHistoryFragment extends Fragment {
    View view;

    public DriverRideHistoryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_driver_ride_history, container, false);
        ListView listView = view.findViewById(R.id.driver_ride_history_listView);
        RideAdapter adapter = new RideAdapter(getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), DriverRideDetailsActivity.class);
                intent.putExtra("driver",RideMock.getMockRides().get(i).getDriver());
                intent.putExtra("passenger",RideMock.getMockRides().get(i).getPassenger());
                intent.putExtra("startLocation",RideMock.getMockRides().get(i).getStartLocation());
                intent.putExtra("endLocation",RideMock.getMockRides().get(i).getEndLocation());
                intent.putExtra("rideLength",RideMock.getMockRides().get(i).getRideLength());
                intent.putExtra("startTime",RideMock.getMockRides().get(i).getStartDateTime());
                intent.putExtra("endTime", RideMock.getMockRides().get(i).getEndDateTime());
                intent.putExtra("rating",RideMock.getMockRides().get(i).getRating());
                intent.putExtra("comment",RideMock.getMockRides().get(i).getComment());
                startActivity(intent);
            }
        });

        return view;
    }

}
