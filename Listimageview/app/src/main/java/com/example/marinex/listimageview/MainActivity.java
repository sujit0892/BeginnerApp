package com.example.marinex.listimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView l1;
    String days[]={"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    l1= (ListView) findViewById( R.id.l1);
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,R.layout.sub,R.id.textView4,days);
        l1.setAdapter(a);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(getApplicationContext(),days[+ position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
