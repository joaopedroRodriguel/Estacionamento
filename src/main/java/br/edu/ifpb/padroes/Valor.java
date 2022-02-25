package br.edu.ifpb.padroes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Valor {

    private BigDecimal valor;

    public BigDecimal totalHoras() {
        return valor;
    }
}
