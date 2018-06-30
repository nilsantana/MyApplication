package com.example.nil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btPrimeiraTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btPrimeiraTela = (Button) findViewById(R.id.btPrimeiraTela);
        btPrimeiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaPrimeiraTela();
            }
        });

    }

    void chamaPrimeiraTela(){
        Intent intent = new Intent();
        intent.setClass(SecondActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
