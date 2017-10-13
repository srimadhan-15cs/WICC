package com.example.madhan.wicc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by madhan on 8/10/17.
 */

public class ListLayoutWithoutImage extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] desc;

    public ListLayoutWithoutImage(Activity context, String[] name, String[] desc) {
        super(context, R.layout.list_layout_with_image, name);
        this.context = context;
        this.name = name;
        this.desc = desc;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        View rowView;
        if (view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.list_layout_without_image, null, true);
        }else {
            rowView = view;
        }

        TextView imgListName = rowView.findViewById(R.id.listname);
        TextView imgListDesc = rowView.findViewById(R.id.listdesc);

        imgListName.setText(name[position]);
        imgListDesc.setText(desc[position]);

        return rowView;
    }
}