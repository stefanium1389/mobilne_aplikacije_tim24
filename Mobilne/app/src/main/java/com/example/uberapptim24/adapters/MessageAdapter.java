package com.example.uberapptim24.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.uberapptim24.R;
import com.example.uberapptim24.mock.PassengerMessagesMock;
import com.example.uberapptim24.mock.RideMock;
import com.example.uberapptim24.model.Message;
import com.example.uberapptim24.model.Ride;

public class MessageAdapter extends BaseAdapter {
    Activity activity;

    public MessageAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return PassengerMessagesMock.getMockMessages().size();
    }

    @Override
    public Object getItem(int i) {
        return PassengerMessagesMock.getMockMessages().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        final RecyclerView.ViewHolder vh;
        Message message = PassengerMessagesMock.getMockMessages().get(position);

        if(vi==null) {
            vi = activity.getLayoutInflater().inflate(R.layout.passenger_chat_list_item, null);
        }
        TextView driver = (TextView)vi.findViewById(R.id.passenger_chat_list_item_sender);
        TextView startDate = (TextView)vi.findViewById(R.id.passenger_chat_list_item_text);

        driver.setText(message.getSender());
        startDate.setText(message.getText());

        return vi;
    }
}
