package com.example.marinex.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
ListView l1;
    String days[]={"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=getListView();
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        l1.setAdapter(a);
    }
    @Override
    public void onListItemClick(ListView l, View view, int position, long id) {
        TextView t=(TextView)view;
        Toast.makeText(this,t.getText(),Toast.LENGTH_SHORT).show();
    }
}
