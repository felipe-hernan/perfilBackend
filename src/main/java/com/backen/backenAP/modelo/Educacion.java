package com.backen.backenAP.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaInicioEdu;
    private int fechaFinEdu;
    @Column(length = 1000)
    private String descripcionEdu;
    private String institucionEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaInicioEdu, int fechaFinEdu, String descripcionEdu, String institucionEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descripcionEdu = descripcionEdu;
        this.institucionEdu = institucionEdu;
    }
}
