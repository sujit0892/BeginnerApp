package com.example.marinex.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by marinex on 22/2/17.
 */

public class recycleAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> n;

    public recycleAdapter(ArrayList<String> i){
        this.n=i;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent,false));
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.t1.setText(n.get(position));

    }

    @Override
    public int getItemCount() {
        return n.size();
    }
}
