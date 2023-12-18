package br.uem.geolocalizacao.dto;

import lombok.Data;

@Data
public class ImovelDTO {

    private Integer id;
    private String localidade;
    private String numero;
    private String complemento;
    private String bairro;
    private String logradouro;
    private String tipoImovel;

}