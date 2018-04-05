package com.escobar.j0e009t.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar number = findViewById(R.id.seekBar);
        number.setMax(10);



        number.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int restingNumber = 0;
            TextView changingNumberDisplay = findViewById(R.id.changingNumber);
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                restingNumber=i;
                changingNumberDisplay.setText(Integer.toString(i));
                changingNumberDisplay.setAlpha(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                changingNumberDisplay.setAlpha(0);
                //This is the final place where I want to set the picture


                Toast.makeText(MainActivity.this, "i: " + restingNumber, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
