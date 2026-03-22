/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.tareasipc;

/**
 *
 * @author vg608
 */
public abstract class EntidadAcademica {
    private String nombre; // encapsulamiento

    public EntidadAcademica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // polimorfismo
    public abstract void mostrarInfo();
}