package com.example.uberapptim24.mock;

import com.example.uberapptim24.model.Ride;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RideMock {

    public RideMock(){

    }

    public static List<Ride> getMockRides() {
        List<Ride> rides = new ArrayList<>();

        Ride ride1 = new Ride("driver1","Passenger1","startLoc1","endLoc1",1,"14.11.2022.18:13","14.11.2022.18:27",3,"meh",123);
        Ride ride2 = new Ride("driver2","Passenger2","startLoc2","endLoc2",2,"14.11.2022.18:13","14.11.2022.18:27",4,"ok",456);
        Ride ride3 = new Ride("driver3","Passenger3","startLoc3","endLoc3",3,"14.11.2022.18:13","14.11.2022.18:27",5,"super",789);
        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        return rides;
    }
}
