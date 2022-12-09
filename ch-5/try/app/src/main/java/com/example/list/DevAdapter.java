package com.example.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DevAdapter extends ArrayAdapter<String> {

private String arr[];
//private String img[];
    public DevAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
//        this.img = img;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

//    public String getImageItems(int position){
//        return img[position];
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_devlayout, parent, false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
//        ImageView i = convertView.findViewById(R.id.imageView);
//        i.setImageDrawable(Drawable.createFromPath(getImageItems(position)));
        return convertView;
    }
}
