package com.example.marinex.buttontest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener( new Click());
    }
    class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
        }
    }
}