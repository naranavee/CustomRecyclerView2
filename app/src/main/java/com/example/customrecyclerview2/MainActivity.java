package com.example.customrecyclerview2;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customrecyclerview2.adapter.RecyclerAdapter;
import com.example.customrecyclerview2.model.RecyclerModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RecyclerModel> recyclerModels = new ArrayList<>();
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_name);

        //create data on recyclermodel
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));
        recyclerModels.add(new RecyclerModel("My Description #1","My Memory title","July 23 2024"));

        recyclerAdapter = new RecyclerAdapter(this,recyclerModels);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}