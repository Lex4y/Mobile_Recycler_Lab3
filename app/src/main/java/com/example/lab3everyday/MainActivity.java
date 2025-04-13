package com.example.lab3everyday;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.name1), getString(R.string.description1), R.drawable.image1));
        items.add(new Item(getString(R.string.name2), getString(R.string.description2), R.drawable.image2));
        items.add(new Item(getString(R.string.name3), getString(R.string.description3), R.drawable.image3));
        items.add(new Item(getString(R.string.name4), getString(R.string.description4), R.drawable.image4));
        items.add(new Item(getString(R.string.name5), getString(R.string.description5), R.drawable.image5));
        items.add(new Item(getString(R.string.name6), getString(R.string.description6), R.drawable.image6));
        items.add(new Item(getString(R.string.name7), getString(R.string.description7), R.drawable.image7));
        items.add(new Item(getString(R.string.name8), getString(R.string.description8), R.drawable.image8));
        items.add(new Item(getString(R.string.name9), getString(R.string.description9), R.drawable.image9));
        items.add(new Item(getString(R.string.name10), getString(R.string.description10), R.drawable.image10));
        items.add(new Item(getString(R.string.name11), getString(R.string.description11), R.drawable.image11));
        items.add(new Item(getString(R.string.name12), getString(R.string.description12), R.drawable.image12));
        items.add(new Item(getString(R.string.name13), getString(R.string.description13), R.drawable.image13));
        items.add(new Item(getString(R.string.name14), getString(R.string.description14), R.drawable.image14));
        items.add(new Item(getString(R.string.name15), getString(R.string.description15), R.drawable.image15));
        items.add(new Item(getString(R.string.name16), getString(R.string.description16), R.drawable.image16));
        items.add(new Item(getString(R.string.name17), getString(R.string.description17), R.drawable.image17));
        items.add(new Item(getString(R.string.name18), getString(R.string.description18), R.drawable.image18));
        items.add(new Item(getString(R.string.name19), getString(R.string.description19), R.drawable.image19));
        items.add(new Item(getString(R.string.name20), getString(R.string.description20), R.drawable.image20));
        items.add(new Item(getString(R.string.name21), getString(R.string.description21), R.drawable.image21));
        items.add(new Item(getString(R.string.name22), getString(R.string.description22), R.drawable.image22));
        items.add(new Item(getString(R.string.name23), getString(R.string.description23), R.drawable.image23));
        items.add(new Item(getString(R.string.name24), getString(R.string.description24), R.drawable.image24));
        items.add(new Item(getString(R.string.name25), getString(R.string.description25), R.drawable.image25));
        items.add(new Item(getString(R.string.name26), getString(R.string.description26), R.drawable.image26));
        items.add(new Item(getString(R.string.name27), getString(R.string.description27), R.drawable.image27));
        items.add(new Item(getString(R.string.name28), getString(R.string.description28), R.drawable.image28));
        items.add(new Item(getString(R.string.name29), getString(R.string.description29), R.drawable.image29));
        items.add(new Item(getString(R.string.name30), getString(R.string.description30), R.drawable.image30));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
    }
}