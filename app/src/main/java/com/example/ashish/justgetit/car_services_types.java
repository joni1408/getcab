package com.example.ashish.justgetit;

public class car_services_types {
    // String car_image;
    String car_name;
    String fare;

    public car_services_types(String car_name, String fare) {
        //this.car_image = car_image;
        this.car_name = car_name;
        this.fare = fare;
    }

    public car_services_types() {

    }

  /*  public String getCar_image() {
        return car_image;
    }

    public void setCar_image(String car_image) {
        this.car_image = car_image;
    }*/

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
