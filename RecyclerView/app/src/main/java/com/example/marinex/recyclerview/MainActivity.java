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



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> name=new ArrayList<String>();
    RecyclerView recycle_view1;
    EditText editText1;
    int i=0;

    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle_view1= (RecyclerView) findViewById(R.id.recycler_view);
        recycle_view1.setLayoutManager(new LinearLayoutManager(this));
add=(Button)findViewById(R.id.button);
        editText1= (EditText) findViewById(R.id.editText);
        recycle_view1.setLayoutManager(new LinearLayoutManager(this));


      add.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                name.add(editText1.getText().toString());
               i++;
        RecyclerView.Adapter<ViewHolder> adapter = new RecyclerView.Adapter<ViewHolder>() {

                    @Override
                    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                        View v = (LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent,false));
                        Toast.makeText(getApplicationContext(),"x0",Toast.LENGTH_SHORT).show();

                        return new ViewHolder(v);


                    }


                    @Override
                    public void onBindViewHolder(ViewHolder viewHolder, int position) {
viewHolder.t1.setText(name.get(position));
                        Toast.makeText(getApplicationContext(),"x0",Toast.LENGTH_LONG).show();
                    }


                    @Override
                    public int getItemCount() {
                        return name.size();
                    }
                };
recycle_view1.setAdapter(adapter);

           }
               });
           }
}

