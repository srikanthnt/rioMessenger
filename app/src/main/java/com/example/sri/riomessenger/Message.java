package com.example.sri.riomessenger;

public class Message {
    String name;
    String Message_txt;
    private String timestamp;


    public Message() {
    }

    public String getName() {
        return name;
    }
    public void setName(String title) {
        this.name = title;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage_txt() {
        return Message_txt;
    }

    public void setMessage_txt(String message_txt) {
        Message_txt = message_txt;
    }
}


