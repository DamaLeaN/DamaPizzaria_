package com.example.damapizzaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btnProx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProx = findViewById(R.id.btnProx);

    }

    public void proxima (View view){
        Intent it = new Intent(this,Cardapio.class);
        startActivity(it);

    }
}