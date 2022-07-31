package com.backen.backenAP.modelo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String titulo;
    private String profecion;
    private String origen;
    @Column(length = 1000)
    private String descripcion;
    private String imagen;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idHabi")
    private List<Habilidad> skillList;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idProy")
    private List<Proyecto> proyectoList;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String apellido, String titulo, String profecion, String origen, String descripcion, String imagen) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.profecion = profecion;
        this.origen = origen;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}
