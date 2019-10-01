package com.example.a18801.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Button button=(Button)findViewById(R.id.button20);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
