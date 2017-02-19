package com.example.marinex.layoutinflate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RelativeLayout)findViewById(R.id.r1);
        LayoutInflater i=getLayoutInflater();
        View v=i.inflate(R.layout.sublayout,null);
        r1.addView(v);
    }
}
