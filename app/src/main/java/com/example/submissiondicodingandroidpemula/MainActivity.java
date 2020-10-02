package com.example.submissiondicodingandroidpemula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvItem;
    private ArrayList<Item> list_animal = new ArrayList<>();

    private Button btnGrid;
    private Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvItem = findViewById(R.id.activity_list_item);
        rvItem.setHasFixedSize(true);

        btnList = findViewById(R.id.main_btn_list);
        btnGrid = findViewById(R.id.main_btn_grid);

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

    public void buttonList(){
        btnList.setBackgroundResource(R.drawable.button_active);
        btnList.setTextColor(getResources().getColor(R.color.whiteColor));

        btnGrid.setBackgroundResource(R.drawable.button_inactive);
        btnGrid.setTextColor(getResources().getColor(R.color.colorPrimary));
        showRecycleList();
    }

    public void buttonGrid() {
        btnGrid.setBackgroundResource(R.drawable.button_active);
        btnGrid.setTextColor(getResources().getColor(R.color.whiteColor));
        btnList.setBackgroundResource(R.drawable.button_inactive);
        btnList.setTextColor(getResources().getColor(R.color.colorPrimary));

        showRecycleList();
    }

    private void showRecycleList(){
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        ListViewAdapter listViewAdapter = new ListViewAdapter(list_animal);
        rvItem.setAdapter(listViewAdapter);

        listViewAdapter.setOnItemClickCallback(new ListViewAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Item data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Item item){
        Toast.makeText(this, "Selected : "+ item.getName(), Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.main_btn_list:
                buttonList();
                break;

            case R.id.main_btn_grid:
                buttonGrid();
                break;
        }
    }
}