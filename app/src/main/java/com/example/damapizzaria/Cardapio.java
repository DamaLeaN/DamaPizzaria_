package com.example.damapizzaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cardapio extends AppCompatActivity {

    private TextView txtPepperoni, txtQueijo, txtFrango, txtValor1, txtValor2, txtValor3;
    private EditText edtPepperoni,edtQueijo, edtFrango;

    private AppCompatButton btnPedido;

    private static final Double PRECO_frango = 48.00;
    private static final Double PRECO_queijo = 45.00;
    private static final Double PRECO_pepperoni = 56.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        txtFrango = findViewById(R.id.txtFrango);
        txtPepperoni = findViewById(R.id.txtPepperoni);
        txtQueijo = findViewById(R.id.txtQueijo);
        txtValor1 = findViewById(R.id.txtValor1);
        txtValor2 = findViewById(R.id.txtValor2);
        txtValor3 = findViewById(R.id.txtValor3);
        edtFrango = findViewById(R.id.edtFrango);
        edtPepperoni = findViewById(R.id.edtPepperoni);
        edtQueijo = findViewById(R.id.edtQueijo);
        btnPedido = findViewById(R.id.btnPedido);

        edtFrango.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if ((edtFrango.length() > 0) || (edtQueijo.length() > 0) ||(edtPepperoni.length() > 0)) {
                    btnPedido.setEnabled(true);
                }

                return false;
            }
        });
    }

    public void pedido (View view){
        Intent it =new Intent(Cardapio.this,Pedido.class);
        double totalPedido = 0.0;

        if (edtPepperoni.length() > 0 && edtPepperoni.getText() != null){
            Resumo.setPizza(txtPepperoni.getText().toString());
            Resumo.setQuantidade(Double.parseDouble(edtPepperoni.getText().toString()));
            Resumo.setValor(Double.parseDouble(txtValor1.getText().toString()));

            totalPedido = Resumo.setQuantidade(Double.parseDouble(edtPepperoni.getText().toString())) * PRECO_pepperoni;


        }
        if (edtFrango.length() > 0 && edtFrango.getText() != null){
            Resumo.setPizza(txtFrango.getText().toString());
            Resumo.setQuantidade(Integer.parseInt(edtFrango.getText().toString()));
            Resumo.setValor(Double.parseDouble(txtValor2.getText().toString()));

            totalPedido = Resumo.setQuantidade(Double.parseDouble(edtFrango.getText().toString())) * PRECO_frango;

        }

        if(edtQueijo.length() > 0 && edtQueijo.getText() != null){
            Resumo.setPizza(txtQueijo.getText().toString());
            Resumo.setQuantidade(Integer.parseInt(edtQueijo.getText().toString()));
            Resumo.setValor(Double.parseDouble(txtValor3.getText().toString()));

            totalPedido = Resumo.setQuantidade(Double.parseDouble(edtQueijo.getText().toString())) * PRECO_queijo;
        }




        it.putExtra("totalPedido", String.format("R$ %.2f", totalPedido));




        startActivity(it);
    }
}