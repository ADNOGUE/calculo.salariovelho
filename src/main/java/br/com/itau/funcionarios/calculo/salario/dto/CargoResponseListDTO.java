package br.com.itau.funcionarios.calculo.salario.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CargoResponseListDTO {

    private List<CargoResponseDTO> content;
}
