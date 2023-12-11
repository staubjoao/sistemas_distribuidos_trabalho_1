package br.uem.arboviroses.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_imovel")
public class TipoImovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_imovel_id")
    private Integer id;

    @Column
    private String descricao;

    @Column
    private String sigla;

}
