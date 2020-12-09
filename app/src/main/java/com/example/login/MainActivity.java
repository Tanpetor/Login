package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button but;
    TextView tw,pas,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.button2);
        tw = findViewById(R.id.textView2);
        log = findViewById(R.id.edLogin);
        pas = findViewById(R.id.edPassword);
        but.setOnClickListener(v ->{
            String l = log.getText().toString();
            String p = pas.getText().toString();
            String logi,passwor;
            logi = "peter";
            passwor = "12345";
            if(logi.equals(l) && passwor.equals(p)) {
                tw.setTextColor(Color.GREEN);
                tw.setText("Weclome");
            }else{
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("kek",10);
                startActivityForResult(i,1);
            }
        });
    }

    public void onActivityResult(int requestcode, int resultcode, Intent data){
        super.onActivityResult(requestcode, requestcode,data);
        switch(resultcode){
            case 1:
                log.setText(data.getStringExtra("kek"));
                pas.setText(data.getStringExtra("kek2"));
                break;
        }
    }
}