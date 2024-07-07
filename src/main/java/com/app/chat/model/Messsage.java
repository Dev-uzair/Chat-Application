package com.app.chat.model;

public class Messsage {

    String name;
    String content;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Messsage(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
