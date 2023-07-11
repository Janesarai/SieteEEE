package com.example.sieteeee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sieteeee.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//primero hacer modelo,

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}