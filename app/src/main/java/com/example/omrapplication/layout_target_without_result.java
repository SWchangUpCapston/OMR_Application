package com.example.omrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class layout_target_without_result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_target_without_result);
    }

    // xml에서 onClick으로 연결된 메서드
    public void goToTargetResult(View view) {
        Intent intent = new Intent(this, activity_target_result.class);
        startActivity(intent);
    }
}