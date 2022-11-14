package com.example.uberapptim24.fragments.driver;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.adapters.RideAdapter;
import com.example.uberapptim24.mock.DriverMock;
import com.example.uberapptim24.model.Driver;


public class DriverAccountFragment extends Fragment {

    View view;

    public DriverAccountFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_driver_account, container, false);
        DriverMock driverMock = new DriverMock();
        Driver dummy = driverMock.getMockSingleDriver();

        TextView tv = (TextView) inf.findViewById(R.id.driver_account_email_value);
        tv.setText(dummy.getEmail());
        tv = (TextView) inf.findViewById(R.id.driver_account_address_value);
        tv.setText(dummy.getAdress());
        tv = (TextView) inf.findViewById(R.id.driver_account_status_value);
        if (dummy.isBlocked())
        {
            tv.setText(R.string.driver_account_blocked);
        }
        else {
            tv.setText(R.string.driver_account_normal);
        }

        tv = (TextView) inf.findViewById(R.id.driver_account_phone_number_value);
        String number = Integer.toString(dummy.getPhoneNumber());
        tv.setText(number);

        tv = (TextView) inf.findViewById(R.id.driver_account_name_and_surname_value);
        String nameAndSurname = dummy.getName() + " "+ dummy.getSurname();
        tv.setText(nameAndSurname);
        return inf;
    }
}