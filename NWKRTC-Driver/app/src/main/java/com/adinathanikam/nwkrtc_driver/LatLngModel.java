package com.adinathanikam.nwkrtc_driver;

public class LatLngModel {

    Double lat, lng;

    public LatLngModel(Double lat, Double lng){
        this.lat=lat;
        this.lng=lng;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }
}
