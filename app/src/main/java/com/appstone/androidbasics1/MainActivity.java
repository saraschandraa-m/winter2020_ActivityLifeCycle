package com.appstone.androidbasics1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.i("MainActivity", "onCreate Called");

        Button btnMoveToLogin = findViewById(R.id.btnMoveLogin);

        btnMoveToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy Called");
    }
}
