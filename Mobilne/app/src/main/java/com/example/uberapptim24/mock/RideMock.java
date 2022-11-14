package com.example.uberapptim24.mock;

import com.example.uberapptim24.model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideMock {

    public RideMock(){

    }

    public static List<Ride> getMockRides() {
        List<Ride> rides = new ArrayList<>();
        Ride ride1 = new Ride("driver1","Passenger1","startLoc1","endLoc1",1);
        Ride ride2 = new Ride("driver2","Passenger2","startLoc2","endLoc2",2);
        Ride ride3 = new Ride("driver3","Passenger3","startLoc3","endLoc3",3);
        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        return rides;
    }
}
