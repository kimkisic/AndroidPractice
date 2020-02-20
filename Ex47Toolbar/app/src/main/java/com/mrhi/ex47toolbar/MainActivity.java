package com.mrhi.ex47toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar를 액션바로 대체하도록..
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
