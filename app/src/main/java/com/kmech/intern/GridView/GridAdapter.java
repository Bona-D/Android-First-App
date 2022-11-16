package com.kmech.intern.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kmech.intern.R;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] fruits;
    int[] images;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] fruits, int[] images) {
        this.context = context;
        this.fruits = fruits;
        this.images = images;
    }

    @Override
    public int getCount() {
        return fruits.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup viewGroup) {

        if (inflater == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (ConvertView == null){

            ConvertView = inflater.inflate(R.layout.grid_item,null);
        }

        ImageView imageView = ConvertView.findViewById(R.id.image);
        TextView textView   = ConvertView.findViewById(R.id.text);

        imageView.setImageResource(images[position]);
        textView.setText(fruits[position]);

        return ConvertView;
    }
}
