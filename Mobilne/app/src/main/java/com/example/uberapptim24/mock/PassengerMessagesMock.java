package com.example.uberapptim24.mock;

import com.example.uberapptim24.model.Driver;
import com.example.uberapptim24.model.Message;
import com.example.uberapptim24.model.MessageType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PassengerMessagesMock {

    public PassengerMessagesMock(){

    }

    public static List<Message> getMockMessages() {
        List<Message> messages = new ArrayList<>();
        String d1 = "Mike";
        String d2 = "Bob";
        Message m1 = new Message(d1,d2,"1234","hellooo", LocalDate.of(2022,6,15), MessageType.DRIVE);
        Message m2 = new Message(d2,d1,"1634","hiii", LocalDate.of(2022,6,16), MessageType.DRIVE);
        Message m3 = new Message(d1,d2,"1834","chat works!", LocalDate.of(2022,6,17), MessageType.DRIVE);
        messages.add(m1);
        messages.add(m2);
        messages.add(m3);
        return messages;
    }
}
