package com.example.dulcisapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Detailed_btn4 extends AppCompatActivity {

    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_btn4);
        button1 = findViewById(R.id.btn4_add);
        button2 = findViewById(R.id.btn4_back);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Detailed_btn4.this, "Added Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Detailed_btn4.this,Dashboard.class);
                startActivity(intent);
            }
        });

    }
}
