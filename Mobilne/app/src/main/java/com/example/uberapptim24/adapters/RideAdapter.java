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

public class RideAdapter extends BaseAdapter {
    Activity activity;
    RideMock mock = new RideMock();

    public RideAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return mock.rides.size();
    }

    @Override
    public Object getItem(int i) {
        return mock.rides.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        final RecyclerView.ViewHolder vh;
        Ride ride = mock.rides.get(position);

        if(vi==null) {
            vi = activity.getLayoutInflater().inflate(R.layout.ride_list_item, null);
        }
        TextView passenger = (TextView)vi.findViewById(R.id.ride_list_item_passenger);
        TextView endLocation = (TextView)vi.findViewById(R.id.ride_list_item_endLocation);

        passenger.setText(ride.getPassenger());
        endLocation.setText(ride.getEndLocation());

        return vi;
    }
}
