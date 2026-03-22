package com.mycompany.tareasipc;



public class Tarea extends EntidadAcademica { // herencia
    private String descripcion;
    private String fechaEntrega;

    public Tarea(String titulo, String descripcion, String fechaEntrega) {
        super(titulo); // llama al constructor del padre
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() { return descripcion; }
    public String getFechaEntrega() { return fechaEntrega; }

    @Override
    public void mostrarInfo() { // polimorfismo
        System.out.println("   [Tarea] " + getNombre());
        System.out.println("   Descripcion: " + descripcion);
        System.out.println("   Entrega: " + fechaEntrega);
    }
}