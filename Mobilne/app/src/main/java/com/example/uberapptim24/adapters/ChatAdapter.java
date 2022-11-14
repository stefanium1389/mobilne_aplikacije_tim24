package com.example.uberapptim24.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.mock.RideMock;
import com.example.uberapptim24.model.Ride;

import java.time.format.DateTimeFormatter;

public class ChatAdapter extends BaseAdapter {
    Activity activity;

    public ChatAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return RideMock.getMockRides().size();
    }

    @Override
    public Object getItem(int i) {
        return RideMock.getMockRides().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        final RecyclerView.ViewHolder vh;
        Ride ride = RideMock.getMockRides().get(position);

        if(vi==null) {
            vi = activity.getLayoutInflater().inflate(R.layout.passenger_inbox_list_item, null);
        }
        TextView driver = (TextView)vi.findViewById(R.id.passenger_inbox_list_item_driver);
        TextView startDate = (TextView)vi.findViewById(R.id.passenger_inbox_list_item_date);

        driver.setText(ride.getDriver());
        startDate.setText(ride.getStartDateTime());

        return vi;
    }
}
