package com.example.uberapptim24.fragments.passenger;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uberapptim24.activities.PassengerChatActivity;
import com.example.uberapptim24.R;
import com.example.uberapptim24.adapters.ChatAdapter;


public class PassengerInboxFragment extends Fragment {

    View view;

    public PassengerInboxFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_passenger_inbox, container, false);
        ListView listView = view.findViewById(R.id.passenger_inbox_listView);
        ChatAdapter adapter = new ChatAdapter(getActivity());
        listView.setAdapter(adapter);

        TextView textView = view.findViewById(R.id.passenger_inbox_support);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PassengerChatActivity.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), PassengerChatActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}