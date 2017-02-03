package com.example.amato19.carstereo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton power;
    private Button am;
    private Button fm;
    private Button volUp;
    private Button volDown;
    private TextView stationName;
    private SeekBar tuner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power = (ToggleButton)findViewById(R.id.powerButton);
        am = (Button)findViewById(R.id.amButton);
        fm = (Button)findViewById(R.id.fmButton);
        volUp = (Button)findViewById(R.id.upButton);
        volDown = (Button)findViewById(R.id.downButton);
        stationName = (TextView)findViewById(R.id.stationView);
        tuner = (SeekBar)findViewById(R.id.tuner);

        power.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    power.setTextColor(0xFFFFFFFF);
                    am.setTextColor(0xFFFFFFFF);
                    fm.setTextColor(0xFFFFFFFF);
                    volUp.setTextColor(0xFFFFFFFF);
                    volDown.setTextColor(0xFFFFFFFF);
                    stationName.setTextColor(0xFFFFFFFF);
                } else
                {
                    power.setTextColor(0x00000000);
                    am.setTextColor(0x00000000);
                    fm.setTextColor(0x00000000);
                    volUp.setTextColor(0x00000000);
                    volDown.setTextColor(0x00000000);
                    stationName.setTextColor(0x00000000);
                }
            }
        });

            final int step = 10;
            final int min = 520;
            tuner.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener()
                {
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {}

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {}

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {
                        double value = min + (progress + step);
                        stationName.setText("" + (int)value);
                    }
                }
        );



    }



}
