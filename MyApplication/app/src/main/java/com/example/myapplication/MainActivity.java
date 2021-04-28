package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    Button Fbutton, Rbutton, Sbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fbutton = findViewById(R.id.button1);
        Fbutton.setOnClickListener(this);
        Rbutton = findViewById(R.id.button2);
        Rbutton.setOnClickListener(this);
        Sbutton = findViewById(R.id.button3);
        Sbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                intent = new Intent(this, FoodActivity.class);
            case R.id.button2:
                intent = new Intent(this, RunActivity.class);
            case R.id.button3:
                intent = new Intent(this, SnackActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

