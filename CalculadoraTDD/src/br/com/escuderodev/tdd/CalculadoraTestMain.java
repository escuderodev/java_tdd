package br.com.escuderodev.tdd;

import br.com.escuderodev.domain.Calculadora;

public class CalculadoraTestMain {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(3,2);
        System.out.println(soma);

        soma = calculadora.somar(3,0);
        System.out.println(soma);

        soma = calculadora.somar(0,0);
        System.out.println(soma);

        soma = calculadora.somar(3,-2);
        System.out.println(soma);

        soma = calculadora.somar(-3,2);
        System.out.println(soma);

        soma = calculadora.somar(-3,-2);
        System.out.println(soma);

    }
}
