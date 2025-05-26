package com.example.omrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void goToFeed(MenuItem item) {
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }
    public void goToTarget(MenuItem item) {
        Intent intent = new Intent(this, TargetActivity.class);
        startActivity(intent);
    }
    public void goToDefault(MenuItem item) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void goToCart(MenuItem item) {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
    public void goToProfile(MenuItem item) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
