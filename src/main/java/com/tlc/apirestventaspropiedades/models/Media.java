package com.tlc.apirestventaspropiedades.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="medida")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url_final")
    private Long urlFinal;


    @Column(name = "url_local")
    private String urlLocal;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;

}
