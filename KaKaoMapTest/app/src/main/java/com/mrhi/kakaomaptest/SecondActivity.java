package com.mrhi.kakaomaptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

public class SecondActivity extends AppCompatActivity {

    RelativeLayout mapContainer;
    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mapContainer= findViewById(R.id.container);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView= new MapView(this);
        mapContainer.addView(mapView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapContainer.removeView(mapView);
        mapView=null;
    }
}
