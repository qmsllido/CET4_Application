package com.example.cetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button UniCon_Btn, MinGme_Btn, Formula_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UniCon_Btn = findViewById(R.id.uniCon_Btn);
        MinGme_Btn = findViewById(R.id.minGme_Btn);
        Formula_Btn = findViewById(R.id.formula_Btn);

        //transition from main screen to unit conversion screen -- lambda function
        UniCon_Btn.setOnClickListener(v -> openUnitConversion());
        Formula_Btn.setOnClickListener(v -> openFormulas());
        MinGme_Btn.setOnClickListener(v -> openMiniGames());
    }

    //activity trigger
    public void openUnitConversion() {
        Intent intent = new Intent(this, UnitConversionActivity.class);
        startActivity(intent);
    }

    public void openFormulas(){
        Intent intent = new Intent(this, FormulaActivity.class);
        startActivity(intent);
    }

    public void openMiniGames() {
        Intent intent = new Intent(this, MiniGamesActivity.class);
        startActivity(intent);
    }
}