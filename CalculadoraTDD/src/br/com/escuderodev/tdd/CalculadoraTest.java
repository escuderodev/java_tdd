package br.com.escuderodev.tdd;

import br.com.escuderodev.domain.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    int soma = 0;

    @Test
    public void somarDoisPositivos() {
        soma = calc.somar(3,2);
        Assertions.assertEquals(5, soma);
    }

    @Test
    public void somarDoisNegativos() {
        soma = calc.somar(-3,-2);
        Assertions.assertEquals(-5, soma);
    }

    @Test
    public void somarPositivoNegativo() {
        soma = calc.somar(3,-2);
        Assertions.assertEquals(1, soma);
    }

    @Test
    public void somarPositivoZero() {
        soma = calc.somar(3,0);
        Assertions.assertEquals(3, soma);
    }

    @Test
    public void somarDoisZeros() {
        soma = calc.somar(0,0);
        Assertions.assertEquals(0, soma);
    }

}
