package com.example.ashish.justgetit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class recharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
    }





   /* Bundle extras=getIntent().getExtras();
        if(extras!=null){
        pickuplocation=extras.getString("pickup");
    }
    Geocoder geocoder= new Geocoder(customer_map.this);
        try {
        list=geocoder.getFromLocationName(pickuplocation,1);
        Address location=list.get(0);
        p1=new LatLng(location.getLatitude(),location.getLongitude());
    } catch (IOException e) {
        e.printStackTrace();
    }*/
}
