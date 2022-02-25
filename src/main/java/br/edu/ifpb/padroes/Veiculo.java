package br.edu.ifpb.padroes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
}
