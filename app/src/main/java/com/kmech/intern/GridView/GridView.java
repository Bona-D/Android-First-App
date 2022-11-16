package com.kmech.intern.GridView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.kmech.intern.R;
import com.kmech.intern.databinding.GridViewBinding;

public class GridView extends AppCompatActivity {

    GridViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GridViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] fruit    = {
                "pears",
                "flacourtia_romontichi",
                "guava",
                "mango",
                "pineapple",
                "strawberry",
            "avocado",
            "cherry",
            "orange"
        };


        int[] image      = {
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

        GridAdapter gridAdapter = new GridAdapter(GridView.this,fruit,image);
        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(GridView.this, "You clicked on " + fruit[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}