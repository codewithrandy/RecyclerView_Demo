package com.codewithrandy.recyclerview_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codewithrandy.recyclerview_demo.adapter.ItemAdapter;
import com.codewithrandy.recyclerview_demo.model.Item;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Freddy", "freddy@codewithrandy.com", R.drawable.a));
        items.add(new Item("Holly", "holly@codewithrandy.com", R.drawable.b));
        items.add(new Item("Chris", "chris@codewithrandy.com", R.drawable.c));
        items.add(new Item("Suzi", "suzi@codewithrandy.com", R.drawable.d));
        items.add(new Item("Steve", "steve@codewithrandy.com", R.drawable.e));
        items.add(new Item("Lucy", "lucy@codewithrandy.com", R.drawable.f));
        items.add(new Item("Kim", "kim@codewithrandy.com", R.drawable.g));
        items.add(new Item("Greg", "greg@codewithrandy.com", R.drawable.h));
        items.add(new Item("Mary", "mary@codewithrandy.com", R.drawable.i));
        items.add(new Item("Opal", "opal@codewithrandy.com", R.drawable.j));
        items.add(new Item("Jake", "jake@codewithrandy.com", R.drawable.k));
        items.add(new Item("Lisa", "lisa@codewithrandy.com", R.drawable.l));
        items.add(new Item("Bobby", "bobby@codewithrandy.com", R.drawable.m));
        items.add(new Item("Howard", "howard@codewithrandy.com", R.drawable.a));
        items.add(new Item("Britney", "britney@codewithrandy.com", R.drawable.b));
        items.add(new Item("John", "john@codewithrandy.com", R.drawable.c));
        items.add(new Item("Cathy", "cathy@codewithrandy.com", R.drawable.d));
        items.add(new Item("Jimmy", "jimmy@codewithrandy.com", R.drawable.e));
        items.add(new Item("Dallas", "dallas@codewithrandy.com", R.drawable.f));
        items.add(new Item("Christine", "christine@codewithrandy.com", R.drawable.g));
        items.add(new Item("Brad", "brad@codewithrandy.com", R.drawable.h));
        items.add(new Item("Molly", "molly@codewithrandy.com", R.drawable.i));
        items.add(new Item("Victoria", "victoria@codewithrandy.com", R.drawable.j));
        items.add(new Item("Austin", "austin@codewithrandy.com", R.drawable.k));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(getApplicationContext(), items));
    }
}