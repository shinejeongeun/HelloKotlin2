package com.example.locationproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager lm;
    List<String> locProvlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        lm = (LocationManager) getSystemService(LOCATION_SERVICE);

        locProvlist = lm.getAllProviders();

        String s = "";
        for (int i = 0; i < locProvlist.size(); i++) {
            s += "Loc.Provider:" + locProvlist.get(i) + "\n"
             +"status: " + lm.isProviderEnabled(locProvlist.get(i)) + "\n\n";
        }
        mTextView.setText(s);


    }
}