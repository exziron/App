package com.example.a240055.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hole

        set=(Button) findViewById(R.id.configButton);
        set.setOnClickListener(goConfigure);
    }

    View.OnClickListener goConfigure = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //hiiiiiiiiiiiiiiii
           Intent intent =  new Intent (MainActivity.this, config.class);
            startActivity(intent);
        }
    };
}
