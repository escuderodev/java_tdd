package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTeste {

    @Test
    public void validaBonusMaiorQueDezPorcentoDevolveZero() {
        BonusService bonusService = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(new Funcionario("Escudero", LocalDate.now(), new BigDecimal("25000"))));

    }

    @Test
    public void validaBonusIgualADezPorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Escudero", LocalDate.now(), new BigDecimal("1000")));

        Assertions.assertEquals(new BigDecimal("100.00"), bonus);
    }

    @Test
    public void validaBonusSalarioIgualAZero() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Escudero", LocalDate.now(), new BigDecimal("0")));

        Assertions.assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void validaBonusIgualAMil() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Escudero", LocalDate.now(), new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
