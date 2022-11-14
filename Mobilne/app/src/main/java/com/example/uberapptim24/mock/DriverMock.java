package com.example.uberapptim24.mock;

import com.example.uberapptim24.model.Driver;

import java.util.ArrayList;
import java.util.List;


public class DriverMock {

    public DriverMock(){

    }

    public Driver getMockSingleDriver() {
        return new Driver("id0123","Alex","Doe","123 Street",123456,"alex@mail.com","some_url",false,"pass123");
    }

    public List<Driver> getMockDrivers() {
        List<Driver> drivers = new ArrayList<>();
        Driver driver1 = new Driver("id0345","John","Doe","234 Street",123456,"my@mail.com","some_url",false,"pass123");
        Driver driver2 = new Driver("id0456","Joshua","Doe","345 Street",123456,"my@mail.com","some_url",false,"pass123");
        Driver driver3 = new Driver("id0567","Anna","Doe","456 Street",123456,"my@mail.com","some_url",false,"pass123");
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        return drivers;
    }
}