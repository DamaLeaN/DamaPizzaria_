package com.example.damapizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pedido extends AppCompatActivity {

    private TextView txtPizza, txtQuantidade,txtPreco,txtConta;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        txtPizza = findViewById(R.id.txtPizza);
        txtQuantidade = findViewById(R.id.txtQuantidade);
        txtPreco = findViewById(R.id.txtPreco);
        txtConta = findViewById(R.id.txtConta);


        txtPizza.setText(Resumo.getPizza());
        txtQuantidade.setText(String.valueOf( " Quantidade: " + Resumo.getQuantidade()));
        txtPreco.setText("Preço da Pizza: R$ " + Resumo.getValor());

        Intent it = getIntent();
        String total = it.getStringExtra("totalPedido");
        txtConta.setText(total);



    }
}