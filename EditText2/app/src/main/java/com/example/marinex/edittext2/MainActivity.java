package com.example.marinex.edittext2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.editable;

public class MainActivity extends AppCompatActivity implements TextWatcher{
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e1.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(!s.toString().trim().equals(""))
        {
            int no = Integer.parseInt(s.toString());
            if (no > 100) {
                s.replace(0, s.length(), "");
                Toast.makeText(getApplicationContext(), "wrong entry", Toast.LENGTH_LONG).show();
            }
        }



    }
}
