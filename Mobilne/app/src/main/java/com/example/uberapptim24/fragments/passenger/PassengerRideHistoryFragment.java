package com.example.uberapptim24.fragments.passenger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.adapters.RideAdapter;

public class PassengerRideHistoryFragment extends Fragment
{
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_driver_ride_history, container, false);
        ListView listView = view.findViewById(R.id.driver_ride_history_listView);
        RideAdapter adapter = new RideAdapter(getActivity());
        listView.setAdapter(adapter);
        return view;
    }
}