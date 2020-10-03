package com.example.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Profile");
        }
    }
}