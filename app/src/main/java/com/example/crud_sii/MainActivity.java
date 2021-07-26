package com.example.crud_sii;

iimport androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getButton(View view) {
    }

    public void signinButton(View view) {
        Intent signinButtonIntent =  new Intent(MainActivity.this,LoginActivity.class);
        startActivity(signinButtonIntent);
    }
}