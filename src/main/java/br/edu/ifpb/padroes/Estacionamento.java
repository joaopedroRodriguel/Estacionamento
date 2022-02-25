package br.edu.ifpb.padroes;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    BigDecimal valor = new BigDecimal(0);
    ValorHora valorHora = new ValorHora();
    ValorDiaria valorDiaria = new ValorDiaria();
    ValorMes valorMes = new ValorMes();

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
        long periodoHoras = Duration.between(entrada, saida).toHours();
        long periodoDias = Duration.between(entrada, saida).toDays();

        if (periodoHoras < 12) {
            valor = valorHora.calcularValorHora(entrada, saida);
        }
        else if (periodoHoras > 12 && periodoDias < 15) {
            valor = valorDiaria.calcularValorDia(entrada, saida);
        }else if (periodoDias > 15) {
           valor = valorMes.calcularValorMes();
        }
        return valor;
    }

}
