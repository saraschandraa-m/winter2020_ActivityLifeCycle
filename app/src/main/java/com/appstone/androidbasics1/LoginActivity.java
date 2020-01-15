package com.appstone.androidbasics1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i("Activity-Login", "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity-Login", "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity-Login", "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity-Login", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity-Login", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity-Login", "onDestroy Called");
    }
}
