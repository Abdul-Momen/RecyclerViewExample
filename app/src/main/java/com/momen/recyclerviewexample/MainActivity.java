package com.momen.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    
 RecyclerView recyclerView;
 RecyclerView.Adapter adapter;
 List<FoodModel> loadlist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //set data in model
        loadlist=new ArrayList<>();

        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"lanch","84"));
        loadlist.add(new FoodModel(R.drawable.lunce3,"lanch","7487"));


        adapter=new FoodAdapter(loadlist,getApplicationContext());
        recyclerView.setAdapter(adapter);


    }
}
