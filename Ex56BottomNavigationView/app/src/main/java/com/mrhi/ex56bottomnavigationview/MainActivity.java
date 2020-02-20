package com.mrhi.ex56bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv= findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //원래는 보통 아이템을 클릭할 때마다
                //Fragment는 변경하는 것이 일반적임.
                switch ( item.getItemId() ){
                    case R.id.bnv_aa:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.CYAN);
                        break;
                    case R.id.bnv_bb:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.MAGENTA);
                        break;
                    case R.id.bnv_cc:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.bnv_dd:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.BLACK);
                        break;
                }

                //리턴값이 true가 아니면 동작하지 않음
                return true;
            }
        });
    }
}
