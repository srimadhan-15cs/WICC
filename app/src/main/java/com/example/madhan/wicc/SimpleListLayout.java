package com.example.madhan.wicc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class SimpleListLayout extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;

    public SimpleListLayout(Activity context, String[] name) {
        super(context, R.layout.simple_list_layout, name);
        this.context = context;
        this.name = name;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        View rowView;
        if (view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.simple_list_layout, null, true);
        }else {
            rowView = view;
        }
        TextView imgListName = rowView.findViewById(R.id.imglistname);
        imgListName.setText(name[position]);

        return rowView;
    }
}