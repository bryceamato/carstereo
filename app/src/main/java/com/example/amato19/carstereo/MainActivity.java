package com.example.amato19.carstereo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton power;
    private ToggleButton amfm;
    //private Button fm;
    private Button volUp;
    private Button volDown;
    private TextView stationName;
    private SeekBar tuner;
    private  double step;
    private double min;
    private Button p1;
    private Button p2;
    private Button p3;
    private Button p4;
    private Button p5;
    private Button p6;

    private double[] fmPresets = {90.9, 92.9, 94.9, 96.9, 98.9, 100.9};
    private double[] amPresets = {550, 600, 650, 700, 750, 800};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power = (ToggleButton)findViewById(R.id.powerButton);
        amfm = (ToggleButton)findViewById(R.id.amfmButton);
        //fm = (Button)findViewById(R.id.fmButton);
        volUp = (Button)findViewById(R.id.upButton);
        volDown = (Button)findViewById(R.id.downButton);
        stationName = (TextView)findViewById(R.id.stationView);
        tuner = (SeekBar)findViewById(R.id.tuner);
        p1 = (Button)findViewById(R.id.preset1Button);
        p2 = (Button)findViewById(R.id.preset2Button);
        p3 = (Button)findViewById(R.id.preset3Button);
        p4 = (Button)findViewById(R.id.preset4Button);
        p5 = (Button)findViewById(R.id.preset5Button);
        p6 = (Button)findViewById(R.id.preset6Button);

        power.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    power.setTextColor(0xFFFFFFFF);
                    amfm.setTextColor(0xFFFFFFFF);
                    //fm.setTextColor(0xFFFFFFFF);
                    volUp.setTextColor(0xFFFFFFFF);
                    volDown.setTextColor(0xFFFFFFFF);
                    stationName.setTextColor(0xFFFFFFFF);
                    p1.setTextColor(0xFFFFFFFF);
                    p2.setTextColor(0xFFFFFFFF);
                    p3.setTextColor(0xFFFFFFFF);
                    p4.setTextColor(0xFFFFFFFF);
                    p5.setTextColor(0xFFFFFFFF);
                    p6.setTextColor(0xFFFFFFFF);
                } else
                {
                    power.setTextColor(0x00000000);
                    amfm.setTextColor(0x00000000);
                    //fm.setTextColor(0x00000000);
                    volUp.setTextColor(0x00000000);
                    volDown.setTextColor(0x00000000);
                    stationName.setTextColor(0x00000000);
                    p1.setTextColor(0x00000000);
                    p2.setTextColor(0x00000000);
                    p3.setTextColor(0x00000000);
                    p4.setTextColor(0x00000000);
                    p5.setTextColor(0x00000000);
                    p6.setTextColor(0x00000000);
                }
            }
        });

        p1.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                if(amfm.isChecked())
                {
                    //stationName.setText("" + amPresets[1]);
                    String preset = "" + stationName.getText();
                    amPresets[1] = Integer.parseInt(preset);
                }else
                {
                    //stationName.setText("" + fmPresets[1]);
                    String preset = "" + stationName.getText();
                    fmPresets[1] = Integer.parseInt(preset);
                }
                return false;
            }
        });

        p1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[1]);
                }else
                {
                    stationName.setText("" + fmPresets[1]);
                }

            }
        });
        p2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[2]);
                }else
                {
                    stationName.setText("" + fmPresets[2]);
                }
            }
        });
        p3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[3]);
                }else
                {
                    stationName.setText("" + fmPresets[3]);
                }
            }
        });
        p4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[4]);
                }else
                {
                    stationName.setText("" + fmPresets[4]);
                }
            }
        });
        p5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[5]);
                }else
                {
                    stationName.setText("" + fmPresets[5]);
                }
            }
        });
        p6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(amfm.isChecked())
                {
                    stationName.setText("" + amPresets[6]);
                }else
                {
                    stationName.setText("" + fmPresets[6]);
                }
            }
        });





        amfm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    amfm.setText("AM");
                    step = 11.7;
                    min = 530;

                } else
                {
                    amfm.setText("FM");
                    step = 0.198;
                    min = 88.1;

                }
            }
        });



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

                        double value = min + (progress * step);
                        stationName.setText("" + (new java.text.DecimalFormat("000.0").format( value )));
                    }
                }
        );



    }



}
