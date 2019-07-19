package com.example.signup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DegreeListViewAdapter extends BaseAdapter {

    ArrayList<userDTO> data;
    Context context;

    public DegreeListViewAdapter(Context context,ArrayList<userDTO> list) {
        this.context = context;
        data = list;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.sign_up_degree_list_view_item,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.sign_up_degree_list_view_item_pic);
        TextView textView = convertView.findViewById(R.id.sign_up_degree_list_view_item_text);
        imageView.setImageResource(data.get(position).pic);
        textView.setText(data.get(position).title);
        return convertView;
    }
}
