/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.modelo;

/**
 *
 * @author jansito
 */
public class Asesor {
    private Integer idAsesor;
    private String nombre;

    public Asesor(Integer idAsesor, String nombre) {
        this.idAsesor = idAsesor;
        this.nombre = nombre;
    }

    public Integer getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Integer idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
