package com.mrhi.ex53listviewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    ArrayList<String> datas;
    LayoutInflater inflater;

    public MyAdapter(ArrayList<String> datas, LayoutInflater inflater) {
        this.datas = datas;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        //1. new view
        //재활용할 뷰가 없는가?
        if(view==null){
            view= inflater.inflate(R.layout.listview_item, viewGroup, false);

            //만들어진 뷰(view)를 보관
            ViewHolder holder= new ViewHolder(view);
            view.setTag(holder);
        }

        //2. bind view
        ViewHolder holder= (ViewHolder)view.getTag();

        String s= datas.get(position);
        holder.tv.setText(s);

        return view;//리스트뷰에 만들 뷰 리턴
    }

    //이너 클래스
    class ViewHolder{

        //아이템뷰 안에 있는 뷰들
        TextView tv;

        public ViewHolder(View itemView) {
            tv= itemView.findViewById(R.id.tv);
        }
    }

}
