package com.kmech.intern.ListView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kmech.intern.R;

public class CustomBaseAdapter extends BaseAdapter {


    Context context;
    String[] listFruit;
    int[] listImages;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] f_List, int [] f_Images){
        this.context    = ctx;
        this.listFruit  = f_List;
        this.listImages = f_Images;
        inflater        = LayoutInflater.from(ctx);


    }


    @Override
    public int getCount() {

        return listFruit.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        convertview             = inflater.inflate(R.layout.custom_list_view, null);
        TextView txtView        = convertview.findViewById(R.id.TextView);
        ImageView fruitimg      = convertview.findViewById(R.id.ImageIcon);
        txtView.setText(listFruit[position]);
        fruitimg.setImageResource(listImages[position]);
        return convertview;
    }
}
