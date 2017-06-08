package com.example.aghil.tobeortohave.model;


import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by aghil on 03/05/2017.
 */

public class DetailItem {
    private String text;
    private String image;
    private double lat;
    private double lng;
    private String titre;


    public DetailItem(String text, String titre, double lat, double lng,String image) {
        this.text =text;
        this.image =image;
        this.lat = lat;
        this.lng = lng;
        this.titre =titre;
    }



    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
    public LatLng getLatLng(){
        return new LatLng(lat,lng);
    }

    public String getTitre() {
        return titre;
    }
}
