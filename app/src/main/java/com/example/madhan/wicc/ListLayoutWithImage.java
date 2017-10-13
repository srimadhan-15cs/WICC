package com.example.madhan.wicc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListLayoutWithImage extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] desc;
    private final Integer[] imgId;

    public ListLayoutWithImage(Activity context, String[] name, String[] desc, Integer[] imgId) {
        super(context, R.layout.list_layout_with_image, name);
        this.context = context;
        this.name = name;
        this.desc = desc;
        this.imgId = imgId;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        View rowView;
        if (view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.list_layout_with_image, null, true);
        }else {
            rowView = view;
        }

        ImageView imageView = rowView.findViewById(R.id.icon);
        TextView imgListName = rowView.findViewById(R.id.imglistname);
        TextView imgListDesc = rowView.findViewById(R.id.imglistdesc);

        imageView.setImageResource(imgId[position]);
        imgListName.setText(name[position]);
        imgListDesc.setText(desc[position]);

        return rowView;
    }
}