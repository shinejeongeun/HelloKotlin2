package com.example.getsensorlist;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mTextSensors;
    SensorManager sensorManager;
    List<Sensor> sensorlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextSensors = findViewById(R.id.textSensors);
        mTextSensors.setMovementMethod(new ScrollingMovementMethod());

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        sensorlist = sensorManager.getSensorList(Sensor.TYPE_ALL);

        mTextSensors.append("# Sensors:" + sensorlist.size() + ")\n\n");
        for(Sensor sensor : sensorlist) {
            mTextSensors.append("Sensor name:" + sensor.getName() + "\n");
            mTextSensors.append("Sensor type:" + sensor.getType() + "\n\n");

        }
    }
}