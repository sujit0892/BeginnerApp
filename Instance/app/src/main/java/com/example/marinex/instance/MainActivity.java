package com.example.marinex.instance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
super.onResume();
        counter++;
    }
    @Override
 protected void onSaveInstanceState(Bundle outstate){
super.onSaveInstanceState(outstate);
        outstate.putInt("counter",counter);
        Toast.makeText(getApplicationContext(),""+counter+"saved",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestoreInstanceState(Bundle in){
        super.onRestoreInstanceState(in);
       counter=in.getInt("counter");
        Toast.makeText(getApplicationContext(),""+counter+"restore",Toast.LENGTH_LONG).show();
    }
}
