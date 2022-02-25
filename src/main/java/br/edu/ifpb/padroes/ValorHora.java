package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ValorHora extends Valor{

    public static BigDecimal VALOR_HORA = new BigDecimal("2.00");

    public BigDecimal calcularValorHora(LocalDateTime entrada, LocalDateTime saida) {
        long periodoHoras = Duration.between(entrada, saida).toHours();
        BigDecimal valor = VALOR_HORA.multiply(new BigDecimal(periodoHoras));
        return valor;
    }

}
