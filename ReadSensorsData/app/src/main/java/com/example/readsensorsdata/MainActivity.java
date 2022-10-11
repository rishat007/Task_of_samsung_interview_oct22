package com.example.readsensorsdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    TextView txtValue_1, txtvalue_2,txtvalue_3;
    SensorManager sensorManager;
    Sensor tempSensor,acceloSensor,pressureSensor;
    Boolean available;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue_1 = findViewById(R.id.txtvalue_1);
        txtvalue_2 = findViewById(R.id.txtvalue_2);
        txtvalue_3 = findViewById(R.id.txtvalue_3);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//Accelerometer
        if(sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)!=null){
            acceloSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                available=true;
        }else{
            txtValue_1.setText("Accelerometer not Available");
            available=false;
        }
//Temperature
        if(sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)!=null){
            tempSensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
            available=true;
        }else{
            txtValue_1.setText("Ambient Temperature not Available");
            available=false;
        }
//Pressure
        if(sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)!=null){
            pressureSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
            available=true;
        }else{
            txtvalue_3.setText("Pressure Sensor not Available");
            available=false;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent SensorEvent) {
       txtValue_1.setText("X: " +SensorEvent.values[0]+ "Y: " +SensorEvent.values[1]+"Z: " +SensorEvent.values[2]);
       txtvalue_2.setText(SensorEvent.values[0] + " Degree celsius");
       txtvalue_3.setText(SensorEvent.values[0] + " Hpa");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if(available){
            sensorManager.registerListener(this, acceloSensor, sensorManager.SENSOR_DELAY_NORMAL);
            sensorManager.registerListener(this, tempSensor, sensorManager.SENSOR_DELAY_NORMAL);
//            sensorManager.registerListener(this, pressureSensor, sensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(available){
            sensorManager.unregisterListener(this);
        }
    }
}