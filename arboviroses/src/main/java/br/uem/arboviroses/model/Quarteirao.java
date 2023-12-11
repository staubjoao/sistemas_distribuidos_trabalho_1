package br.uem.arboviroses.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;


@Data
@Entity
@Table(name = "quarteirao")
public class Quarteirao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quarteirao_id")
    private Integer id;
    @Column
    @Valid
    private Integer numero;

}
