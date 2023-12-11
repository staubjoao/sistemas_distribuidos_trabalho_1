package br.uem.arboviroses.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imovel_id")
    private Integer id;

    @Column
    private String localidade;

    @Column
    private String numero;

    @Column
    private String complemento;

    @Column
    private String latitude;

    @Column
    private  String longitude;

    @ManyToOne
    @JoinColumn(name = "fk_bairro_id")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "fk_logradouro_id")
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "fk_quarteirao_id")
    private Quarteirao quarteirao;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_imovel_id")
    private TipoImovel tipoImovel;

}
