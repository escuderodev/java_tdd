package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {
    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializarObjetos() {
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Escudero", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForADesejar() {
        service.validaDesenpenho(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForBom() {
        service.validaDesenpenho(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer3PorCentoQuandoDesempenhoForOtimo() {
        service.validaDesenpenho(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
