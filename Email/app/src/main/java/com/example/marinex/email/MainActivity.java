package com.example.marinex.email;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button send; EditText subtxt,totxt,txt;String to;
    String sub;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.txt);
        totxt=(EditText)findViewById(R.id.totxt);
        subtxt=(EditText)findViewById(R.id.subtxt);
        send=(Button)findViewById(R.id.send);
        to=totxt.getText().toString();
        sub=subtxt.getText().toString();
        msg=txt.getText().toString();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL,to);
                i.putExtra(Intent.EXTRA_SUBJECT,sub);
                i.putExtra(Intent.EXTRA_TEXT,msg);
                i.setType("message/rfc822");
                startActivity(i);
            }
        });
    }
}
