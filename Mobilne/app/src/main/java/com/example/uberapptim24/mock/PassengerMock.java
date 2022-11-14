package com.example.uberapptim24.mock;

import com.example.uberapptim24.model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerMock
{
    public PassengerMock(){

    }

    public Passenger getMockSinglePassenger() {
        return new Passenger("id0123","Alex","Doe","123 Street",123456,"alex@mail.com","some_url",false,"pass123");
    }

    public List<Passenger> getMockPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("id0345","John","Doe","234 Street",123456,"my@mail.com","some_url",false,"pass123");
        Passenger passenger2 = new Passenger("id0456","Joshua","Doe","345 Street",123456,"my@mail.com","some_url",false,"pass123");
        Passenger passenger3 = new Passenger("id0567","Anna","Doe","456 Street",123456,"my@mail.com","some_url",false,"pass123");
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        return passengers;
    }
}
