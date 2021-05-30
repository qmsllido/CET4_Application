package com.example.cetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button UniCon_Btn, MinGme_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UniCon_Btn = findViewById(R.id.uniCon_Btn);
        MinGme_Btn = findViewById(R.id.minGme_Btn);

        //transition from main screen to unit conversion screen
        //UniCon_Btn.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                openUnitConversion();
        //            }
        //        });
        UniCon_Btn.setOnClickListener(v -> openUnitConversion());
        MinGme_Btn.setOnClickListener(v -> openMiniGames());
    }

    public void openUnitConversion() {
        Intent intent = new Intent(this, UnitConversionActivity.class);
        startActivity(intent);
    }

    public void openFormulas(){
        Intent intent = new Intent(this, MiniGamesActivity.class);
        startActivity(intent);
    }

    public void openMiniGames() {
        Intent intent = new Intent(this, MiniGamesActivity.class);
        startActivity(intent);
    }
}