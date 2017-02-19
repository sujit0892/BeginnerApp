package com.example.marinex.togglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
RelativeLayout i;
    ToggleButton t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    t1= (ToggleButton) findViewById(R.id.t1);
        i= (RelativeLayout) findViewById(R.id.i);
        t1.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        if(b==true){
            i.setBackgroundColor(Color.BLACK);
            
        }
        else
        {
            i.setBackgroundColor(Color.WHITE);
        }
    }
}
