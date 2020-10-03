package com.example.submissiondicodingandroidpemula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        TextView nama_item = findViewById(R.id.detail_name);
        TextView detail_item = findViewById(R.id.detail_detail);
        ImageView img_item = findViewById(R.id.detail_img);
        Button btnFav = findViewById(R.id.btn_favorite);

        final Item item = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(item != null){
            Glide.with(this)
                    .load(item.getPhoto())
                    .centerCrop()
                    .into(img_item);
            nama_item.setText(item.getName());
            detail_item.setText(item.getDetail());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Hewan");
        }

        btnFav.setOnClickListener(new View .OnClickListener(){

            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.btn_favorite);
                String messeage = "Ada memfavoritkan " + item.getName();
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, messeage, duration);
            }
        });

    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}
