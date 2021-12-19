package com.example.canty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "shivam,owais,karan,akash,apoorva confirm if eveerybody is getting this toast", Toast.LENGTH_SHORT).show();

    }
}