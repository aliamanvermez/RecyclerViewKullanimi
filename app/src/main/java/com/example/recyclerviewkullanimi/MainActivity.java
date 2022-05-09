package com.example.recyclerviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList <String> ulkelerList;
    private RVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true); //verilerin düzgün durması için
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ulkelerList = new ArrayList<>();
        ulkelerList.add("Turkey");
        ulkelerList.add("Germany");
        ulkelerList.add("Italy");
        ulkelerList.add("Russia");

        adapter = new RVAdapter(this,ulkelerList);

        recyclerView.setAdapter(adapter);
    }
}