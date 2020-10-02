package com.example.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Profile");
        }

        ImageView btn = findViewById(R.id.profile_btn_back);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(back);
    }
}