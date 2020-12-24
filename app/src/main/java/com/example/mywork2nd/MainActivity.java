package com.example.mywork2nd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String[] item_names;
    RecyclerView recylerview1;
    int[] item_images = {
            R.drawable.burgers,
            R.drawable.chicken,
            R.drawable.dsserts,
            R.drawable.hot_drinks,
            R.drawable.sandwitch_wraps,
    };
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerview1 = findViewById(R.id.recycleview1);
        item_names = getResources().getStringArray(R.array.resturent_menu);
        adapterClass madapterOBJ = new adapterClass(this, item_names, item_images);
        recylerview1.setAdapter(madapterOBJ);
        recylerview1.setLayoutManager(new LinearLayoutManager(this));
    }
}
