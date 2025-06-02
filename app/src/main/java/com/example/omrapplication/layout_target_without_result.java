package com.example.omrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class layout_target_without_result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_target_without_result);
    }

    public void goToTarget(MenuItem item) {
        Intent intent = new Intent(this, TargetActivity.class);
        startActivity(intent);
    }
}