package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ValorDiaria extends Valor{

    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");

    public BigDecimal calcularValorDia(LocalDateTime entrada, LocalDateTime saida) {
        long periodoDias = Duration.between(entrada, saida).toDays();
        BigDecimal valor = VALOR_DIARIA.multiply(new BigDecimal(periodoDias));
        return valor;
    }


}

