package com.example.copassappwbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOpenCopass;
    Intent intentCompassActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCopass = findViewById(R.id.btnOpenCopassView);

        btnOpenCopass.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOpenCopassView:
                intentCompassActivity = new Intent(this, CompassActivity.class);
                startActivity(intentCompassActivity);
            default:
                break;
        }
    }
}