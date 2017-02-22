package com.example.marinex.recyclerview;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayList<String> name=new ArrayList<String>();
    RecyclerView recycle_view1;
    EditText editText1;

    Button add;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle_view1= (RecyclerView) findViewById(R.id.recycler_view);
        recycle_view1.setLayoutManager(new LinearLayoutManager(this));
add=(Button)findViewById(R.id.button);
        editText1= (EditText) findViewById(R.id.editText);
        recycleAdapter r=new recycleAdapter(name);

        recycle_view1.setLayoutManager(new LinearLayoutManager(this));
recycle_view1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        
    }
});

      add.setOnClickListener(this);

           }

    @Override
    public void onClick(View v) {
        name.add(editText1.getText().toString());
        Toast.makeText(MainActivity.this, ""+name.size(), Toast.LENGTH_SHORT).show();

        recycle_view1.setAdapter(new recycleAdapter(name));

    }
}

