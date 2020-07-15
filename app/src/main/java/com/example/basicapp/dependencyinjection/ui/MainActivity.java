package com.example.basicapp.dependencyinjection.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.basicapp.R;
import com.example.basicapp.dependencyinjection.adapter.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}