package com.example.progectgitpogorelova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//коммит1 для сессион2
        super.onCreate(savedInstanceState);//создали ветку сессион2
        setContentView(R.layout.activity_main);//коммит1 для сессион1
    }
}