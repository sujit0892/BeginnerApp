package com.example.marinex.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSomething(View v){
        if(v.getId()==R.id.button1)
        Toast.makeText(getApplicationContext(),"Button1",Toast.LENGTH_LONG).show();
        if(v.getId()==R.id.button2)
            Toast.makeText(getApplicationContext(),"Button2",Toast.LENGTH_LONG).show();
    }
}
