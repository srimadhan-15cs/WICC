package com.example.madhan.wicc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListLayoutWithImageAndName extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final Integer[] imgId;

    public ListLayoutWithImageAndName(Activity context, String[] name, Integer[] imgId) {
        super(context, R.layout.list_layout_with_image, name);
        this.context = context;
        this.name = name;
        this.imgId = imgId;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        View rowView;
        if (view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.list_layout_with_image_and_name, null, true);
        }else {
            rowView = view;
        }

        ImageView imageView = rowView.findViewById(R.id.imageicon);
        TextView imageListName = rowView.findViewById(R.id.imagelistname);

        imageView.setImageResource(imgId[position]);
        imageListName.setText(name[position]);

        return rowView;
    }
}