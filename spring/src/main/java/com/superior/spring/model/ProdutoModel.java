package com.superior.spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBPRODUTO")
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "CDPRODUTO")
    private int cdProduto;
    @Column(name = "NMPRODUTO")
    private String nmProduto;
    @Column(name = "DSPRODUTO")
    private String dsProduto;
    @Column(name = "VLPRODUTO")
    private String vlProduto;
    @Column(name = "FLATIVO")
    private String fltProduto;
}
