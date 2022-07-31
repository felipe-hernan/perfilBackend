package com.backen.backenAP.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String nombreProy;
    @Column(length = 1000)
    private String descripcionProy;
    private int fechaProy;
    private String linkProy;
    private String imgProy;

    public Proyecto() {
    }

    public Proyecto(Long idProy, String nombreProy, String descripcionProy, int fechaProy, String linkProy, String imgProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.descripcionProy = descripcionProy;
        this.fechaProy = fechaProy;
        this.linkProy = linkProy;
        this.imgProy = imgProy;
    }
}
