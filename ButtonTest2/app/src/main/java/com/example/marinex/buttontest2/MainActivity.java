package com.example.marinex.buttontest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b1)
            Toast.makeText(getApplicationContext(),"Button1",Toast.LENGTH_LONG).show();
        if(v.getId()==R.id.b2)
            Toast.makeText(getApplicationContext(),"Button2",Toast.LENGTH_LONG).show();
    }
}
