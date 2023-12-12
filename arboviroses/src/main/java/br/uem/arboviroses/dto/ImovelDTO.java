package br.uem.arboviroses.dto;

import br.uem.arboviroses.model.*;

import lombok.Data;

@Data
public class ImovelDTO {

    private Integer id;
    private String localidade;
    private String numero;
    private String complemento;
    private Bairro bairro;
    private Logradouro logradouro;
    private Quarteirao quarteirao;
    private TipoImovel tipoImovel;

}
