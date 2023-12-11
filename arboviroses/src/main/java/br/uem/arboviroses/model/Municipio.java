package br.uem.arboviroses.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Entity
@Table(name = "municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "municipio_id")
    private Integer id;

    @Column
    @Valid
    private String municipio;

    @Column
    private Integer quantidadeImoveisUrbanos;

    @Column
    private Integer quantidadeImoveisRuais;

    @Column
    private boolean infestado;
}
