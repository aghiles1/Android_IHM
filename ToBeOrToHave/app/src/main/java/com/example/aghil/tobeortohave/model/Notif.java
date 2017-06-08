package com.example.aghil.tobeortohave.model;

/**
 * Created by aghil on 10/05/2017.
 */

public class Notif {
    private String text;
    private int image;
    public Notif(){

    }

    public Notif(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}
