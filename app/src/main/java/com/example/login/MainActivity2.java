package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button but;
    TextView tw,lo,pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        but = findViewById(R.id.button);
        lo = findViewById(R.id.edLogin2);
        pa = findViewById(R.id.edPassword2);
       // int r = getIntent().getIntExtra("kek",0);
       // tw.setText(Integer.toString(r));
        but.setOnClickListener(v ->{
            String log = lo.getText().toString();
            String pas = pa.getText().toString();
            Toast.makeText(this, "close",Toast.LENGTH_SHORT).show();
            Intent i = new Intent();
            i.putExtra("kek",log);
            i.putExtra("kek2",pas);
            setResult(1,i);
            finish();
        });
    }
}