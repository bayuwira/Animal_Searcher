package com.example.submissiondicodingandroidpemula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {
    private RecyclerView rvItem;
    private ArrayList<Item> list_animal = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvItem = findViewById(R.id.activity_list_item);
        rvItem.setHasFixedSize(true);

        list_animal.addAll(ItemData.getListData());
        showRecycleList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.profile){
            Intent goto_profile = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(goto_profile);
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecycleList(){
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        ListViewAdapter listViewAdapter = new ListViewAdapter(list_animal);
        rvItem.setAdapter(listViewAdapter);

        listViewAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Item item) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.ITEM_EXTRA, item);
                startActivity(intent);
            }
        });

    }
}