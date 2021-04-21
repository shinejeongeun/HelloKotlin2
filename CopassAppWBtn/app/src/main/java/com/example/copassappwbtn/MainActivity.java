package com.example.copassappwbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOpenCopass, btnMap;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCopass = findViewById(R.id.btnOpenCopassView);
        btnOpenCopass.setOnClickListener(this);
        btnMap = findViewById(R.id.btnMap);
        btnMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOpenCopassView:
                intent= new Intent(this, CompassActivity.class);
            case  R.id.btnMap:
                intent = new Intent(this, MapsActivity.class);
                startActivity(intent); break;
            default:
                break;
        }
    }
}