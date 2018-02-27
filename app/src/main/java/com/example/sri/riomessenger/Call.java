package com.example.sri.riomessenger;

public class Call {
    String name;
    String Call_type;
    private String timestamp;


    public Call() {
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

    public String getCall_type() {
        return Call_type;
    }

    public void setMessage_txt(String message_txt) {Call_type= message_txt;
    }
}


