package com.example.cetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
    private Button UniCon_Btn, Formula_Btn, MinGme_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UniCon_Btn = findViewById(R.id.UniCon_Btn);
        Formula_Btn = findViewById(R.id.Formula_Btn);
        MinGme_Btn = findViewById(R.id.MinGme_Btn);

        //transition from main screen to unit conversion screen
        //UniCon_Btn.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                openUnitConversion();
        //            }
        //        });
        UniCon_Btn.setOnClickListener(v -> openUnitConversion());
    }

    public void openUnitConversion() {
        Intent intent = new Intent(this, UnitConversionActivity.class);
        startActivity(intent);
    }
}