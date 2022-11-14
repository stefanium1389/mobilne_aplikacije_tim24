package com.example.uberapptim24.fragments.passenger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.mock.PassengerMock;
import com.example.uberapptim24.model.Passenger;

public class PassengerAccountFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_passenger_account, container, false);
        PassengerMock passengerMock = new PassengerMock();
        Passenger dummy = passengerMock.getMockSinglePassenger();

        TextView tv = (TextView) inf.findViewById(R.id.passenger_account_email_value);
        tv.setText(dummy.getEmail());
        tv = (TextView) inf.findViewById(R.id.passenger_account_address_value);
        tv.setText(dummy.getAdress());
        tv = (TextView) inf.findViewById(R.id.passenger_account_status_value);
        if (dummy.isBlocked())
        {
            tv.setText(R.string.passenger_account_blocked);
        }
        else {
            tv.setText(R.string.passenger_account_normal);
        }

        tv = (TextView) inf.findViewById(R.id.passenger_account_phone_number_value);
        String number = Integer.toString(dummy.getPhoneNumber());
        tv.setText(number);

        tv = (TextView) inf.findViewById(R.id.passenger_account_name_and_surname_value);
        String nameAndSurname = dummy.getName() + " "+ dummy.getSurname();
        tv.setText(nameAndSurname);
        return inf;
    }
}