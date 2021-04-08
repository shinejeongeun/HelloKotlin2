package com.example.locationproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager lm;
    List<String> locProvlist;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        mbutton = findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lm = (LocationManager) getSystemService(LOCATION_SERVICE);
                locProvlist = lm.getAllProviders();
                String s = "";
                for(String str : locProvlist){
                    s += "Loc. Provider:" + str + "\n" +
                            "Statue:" + lm.isProviderEnabled(str) + "\n\n";

                }
                mTextView.setText(s);
            }
        });

    }
}