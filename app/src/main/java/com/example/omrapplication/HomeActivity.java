package com.example.omrapplication;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
    public void goToChatbot(View view){
        Intent intent = new Intent(this, ChatbotActivity.class);
        startActivity(intent);
    }
    public void goToSurvey(View view){
        Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }
    public void goToSkinCamera(View view){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }
    public void goToYoutube(View view) {
        String url = "https://www.youtube.com/watch?v=iQWVp4sAs18"; // 원하는 유튜브 영상 URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.setPackage("com.google.android.youtube"); // 유튜브 앱 우선 실행 시도
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // 유튜브 앱이 없으면 브라우저로
            intent.setPackage(null);
            startActivity(intent);
        }
    }
}
