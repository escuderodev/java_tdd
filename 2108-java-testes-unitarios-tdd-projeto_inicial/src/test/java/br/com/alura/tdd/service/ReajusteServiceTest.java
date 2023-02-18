package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Escudero", LocalDate.now(), new BigDecimal("1000.00"));
        service.validaDesenpenho(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Escudero", LocalDate.now(), new BigDecimal("1000.00"));
        service.validaDesenpenho(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Escudero", LocalDate.now(), new BigDecimal("1000.00"));
        service.validaDesenpenho(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
