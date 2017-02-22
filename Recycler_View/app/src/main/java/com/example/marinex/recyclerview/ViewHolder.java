package com.example.marinex.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by marinex on 22/2/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView t1;
    public ViewHolder(View v) {
        super(v);
        t1=(TextView)v.findViewById(R.id.textView);

    }
}
