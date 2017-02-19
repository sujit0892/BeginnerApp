package com.example.marinex.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String days[]={"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
   ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1= (ListView) findViewById(R.id.l1);
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        l1.setAdapter(a);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView t=(TextView)view;
                Toast.makeText(getApplicationContext(),t.getText()+""+position+" "+id,Toast.LENGTH_LONG).show();
            }
        });
    }
}
