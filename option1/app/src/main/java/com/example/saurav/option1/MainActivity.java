package com.example.saurav.option1;

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
                Toast.makeText(getApplicationContext(),"item1 selected",Toast.LENGTH_SHORT).show();
      break;
            case R.id.i2:
                Toast.makeText(getApplicationContext(),"item2 selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(getApplicationContext(),"item4 selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i4:
                Toast.makeText(getApplicationContext(),"item4 selected",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}
