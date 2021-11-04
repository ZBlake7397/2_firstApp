package com.example.theworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
    }

    public void resumeMove(View view){
        Intent intent = new Intent(this, ResumeActivity.class);
        startActivity(intent);
    }
}