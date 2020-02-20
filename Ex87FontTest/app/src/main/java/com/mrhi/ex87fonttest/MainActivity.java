package com.mrhi.ex87fonttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= findViewById(R.id.tv);

        //폰트설정
        //Assets폴더의 창고관리자 객체 소환
        AssetManager assetManager= getAssets();

        //폰트객체 생성
        Typeface typeface= Typeface.createFromAsset(assetManager, "fonts/billabong.otf");
        tv.setTypeface(typeface);


    }
}
