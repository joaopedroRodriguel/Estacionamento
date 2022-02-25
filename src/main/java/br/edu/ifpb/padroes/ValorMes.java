package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ValorMes extends Valor {

    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");

    public BigDecimal calcularValorMes(){
        BigDecimal valor = VALOR_MENSALIDADE;
        return valor;
    }
}
