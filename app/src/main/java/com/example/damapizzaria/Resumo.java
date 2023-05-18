package com.example.damapizzaria;

public class Resumo {
    public static String pizza;
    public static double quantidade;

    public static double valor;

    public static double getValor() {
        return valor;
    }

    public static double setValor(double valor) {
        Resumo.valor = valor;
        return valor;
    }

    public static double getConta() {
        return conta;
    }

    public static double setConta(double conta, double qtd) {
        Resumo.conta = conta;
        conta *= qtd;
        return conta;
    }

    public static double conta;

    public static String getPizza() {
        return pizza;
    }

    public static void setPizza(String pizza) {
        Resumo.pizza = pizza;
    }

    public static double getQuantidade() {
        return quantidade;
    }

    public static double setQuantidade(double quantidade) {
        Resumo.quantidade = quantidade;
        return quantidade;
    }
}
