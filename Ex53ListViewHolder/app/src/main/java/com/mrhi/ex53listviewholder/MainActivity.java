package com.mrhi.ex53listviewholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter adapter;

    ArrayList<String> datas= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터추가
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
        datas.add("fff");
        datas.add("ggg");
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
        datas.add("fff");
        datas.add("ggg");

        listView= findViewById(R.id.listview);
        adapter= new MyAdapter(datas, getLayoutInflater());
        listView.setAdapter(adapter);
    }
}
