package com.backen.backenAP.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String cargoExp;
    private int fechaInicioExp;
    private int fechaFinExp;
    @Column(length = 1000)
    private String descripcionExp;
    private String fotoExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String cargoExp, int fechaInicioExp, int fechaFinExp, String descripcionExp, String fotoExp) {
        this.idExp = idExp;
        this.cargoExp = cargoExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.descripcionExp = descripcionExp;
        this.fotoExp = fotoExp;
    }
}
