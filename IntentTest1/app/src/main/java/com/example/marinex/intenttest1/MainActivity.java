package com.example.marinex.intenttest1;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends Activity implements View.OnClickListener {
    Button call, message, market, map,dial;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = (Button) findViewById(R.id.call);
        message = (Button) findViewById(R.id.message);
        market = (Button) findViewById(R.id.market);
        map = (Button) findViewById(R.id.map);

        dial = (Button) findViewById(R.id.dial);

        call.setOnClickListener(this);
        message.setOnClickListener(this);
        market.setOnClickListener(this);
        map.setOnClickListener(this);
      
    }

    @Override
    public void onClick(View v) {
        a = v.getId();
        Intent i = null, chooser = null;
        switch (a) {
            case R.id.map:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:"));
                chooser = i.createChooser(i, "Launch Map");
                startActivity(i);
                break;
            case R.id.call:
                i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:123"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                }
                startActivity(i);
                break;
            case R.id.market:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("market://details?id=com.whatsapp"));

                startActivity(i);
                break;
            case R.id.message:
                i = new Intent(Intent.ACTION_MAIN);
                i=getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(i);
                break;
            case R.id.dial:
                i = new Intent(Intent.ACTION_DIAL);
                startActivity(i);
                break;

        }
    }
}
