package com.example.uberapptim24.model;

import java.time.LocalDate;

public class Message {
    private String sender;
    private String reciever;
    private String id;
    private String text;
    private LocalDate date;
    private MessageType type;

    public Message(String sender, String reciever, String id, String text, LocalDate date, MessageType type) {
        this.sender = sender;
        this.reciever = reciever;
        this.id = id;
        this.text = text;
        this.date = date;
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
