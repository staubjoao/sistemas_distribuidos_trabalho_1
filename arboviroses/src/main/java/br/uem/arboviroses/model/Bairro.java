package br.uem.arboviroses.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Entity
@Table(name = "bairro")
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bairro_id")
    private Integer id;

    @Column
    @Valid
    private String nome;

    @ManyToOne
    @JoinColumn(name = "fk_municipio_id")
    private Municipio municipio;

}
