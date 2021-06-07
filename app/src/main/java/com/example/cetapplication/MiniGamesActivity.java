package com.example.cetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MiniGamesActivity extends AppCompatActivity {
    Button MiniEasy_Btn, MiniMid_Btn, MiniHard_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minigame);

        MiniEasy_Btn = findViewById(R.id.miniEasy_Btn);
        MiniMid_Btn = findViewById(R.id.miniMid_Btn);
        MiniHard_Btn = findViewById(R.id.miniHrd_Btn);


        MiniEasy_Btn.setOnClickListener(v -> openEasyGame());
        // MiniMid_Btn.setOnClickListener(v -> openMidGame());
        // MiniHard_Btn.setOnClickListener(v -> openHardGame());
    }

    public void openEasyGame() {
        Intent intent = new Intent(this, MiniEasyGameActivity.class);
        startActivity(intent);
        //}
        //public void openMidGame() {
        // Intent intent = new Intent(this, MiniMidGameActivity.class);
        //startActivity(intent);
        //}
        //public void openHardGame() {
        //  Intent intent = new Intent(this, MiniHardGameActivity.class);
        //startActivity(intent);
        //}
    }


}