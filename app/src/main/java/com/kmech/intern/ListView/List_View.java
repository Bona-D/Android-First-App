package com.kmech.intern.ListView;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.kmech.intern.R;

public class List_View extends AppCompatActivity {
    String fruitList[]     = {
            "pears",
            "flacourtia_romontichi",
            "guava",
            "mango",
            "pineapple",
            "strawberry",
//            "avocado",
//            "cherry",
//            "orange"
    };


    int fruitImage[]       = {
            R.drawable.pears,
            R.drawable.flacourtia_ramontchi,
            R.drawable.guava,
            R.drawable.mango,
            R.drawable.pineapple,
            R.drawable.strawberry,
            R.drawable.avocado,
            R.drawable.cherry,
            R.drawable.orange
    };

    ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        list_view           = (ListView) findViewById(R.id.ListView);
        CustomBaseAdapter   customBaseAdapter   = new CustomBaseAdapter(getApplicationContext(),fruitList, fruitImage);
        list_view.setAdapter(customBaseAdapter);

//        list_view.setOnItemClickListener();
    }
}