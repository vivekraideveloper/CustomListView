package com.vijayjaidewan01vivekrai.customlistview_github;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MR VIVEK RAI on 30-05-2018.
 */

public class CustomAdapter extends ArrayAdapter {
    private Activity activity;
    private Integer[] image;
    private String[] text;


    public CustomAdapter(Activity activity, Integer[] image, String[] text) {
        super(activity, R.layout.custom_layout, text);
        this.activity = activity;
        this.image = image;
        this.text = text;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_layout, null);

        TextView textView = view.findViewById(R.id.text_view);
        ImageView imageView = view.findViewById(R.id.image_view);

        textView.setText(text[position]);
        imageView.setImageResource(image[position]);
        return view;
    }
}
