package com.example.saurav.option;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu m){
getMenuInflater().inflate(R.menu.menu,m);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem m){
        switch(m.getItemId()){
            case R.id.i1:
                Toast.makeText()
        }
    }

}
