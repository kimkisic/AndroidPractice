package com.mrhi.ex05compoundbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //뷰들의 참조변수 : 멤버변수
    CheckBox cb01, cb02, cb03;
    TextView tv;

    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb01= findViewById(R.id.cb01);
        cb02= findViewById(R.id.cb02);
        cb03= findViewById(R.id.cb03);

        tv= findViewById(R.id.tv);

        //체크박스의 체크상태가 변경되는 것을 듣는 리스너객체 생성 및 추가
        CompoundButton.OnCheckedChangeListener changeListener= new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //선택된 CheckBox의 글씨 얻어오기
                String s="";

                if(cb01.isChecked()) s+= cb01.getText().toString();
                if(cb02.isChecked()) s+= cb02.getText().toString();
                if(cb03.isChecked()) s+= cb03.getText().toString();

                tv.setText(s);

            }
        };


        cb01.setOnCheckedChangeListener(changeListener);
        cb02.setOnCheckedChangeListener(changeListener);
        cb03.setOnCheckedChangeListener(changeListener);


        tb= findViewById(R.id.tb);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                tv.setText(  checked +""  );

            }
        });


    }

    //onClick속성이 부여된 View가 클릭되면
    //자동으로 실행되는 콜백메소드
    public void clickBtn(View v){

        //선택된 CheckBox의 글씨 얻어오기
        String s="";

        if(cb01.isChecked()) s+= cb01.getText().toString();
        if(cb02.isChecked()) s+= cb02.getText().toString();
        if(cb03.isChecked()) s+= cb03.getText().toString();

        tv.setText(s);

    }

}
