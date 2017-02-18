package com.example.marinex.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t=new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                LayoutInflater i=getLayoutInflater();
                t.setView(i.inflate(R.layout.toast,(ViewGroup) findViewById(R.id.l1)));
                t.show();
            }
        });
    }
}
