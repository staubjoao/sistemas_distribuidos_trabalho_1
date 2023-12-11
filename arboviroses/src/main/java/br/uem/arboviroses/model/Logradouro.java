package br.uem.arboviroses.model;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Entity(name = "Logradouro")
@Table(name = "logradouro")
public class Logradouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logradouro_id")
    private Integer id;

    @Column
    private String logradouro;

}
