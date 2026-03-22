package com.mycompany.tareasipc;



public class Curso extends EntidadAcademica { 
    
    private String codigo;
    private String tutor;
    private Tarea[] tareas;
    private int totalTareas;
    private static final int MAX_TAREAS = 20;

    public Curso(String nombre, String codigo, String tutor) {
        super(nombre);
        this.codigo = codigo;
        this.tutor = tutor;
        this.tareas = new Tarea[MAX_TAREAS];
        this.totalTareas = 0;
    }

    public String getCodigo() { return codigo; }
    public String getTutor() { return tutor; }

    public boolean agregarTarea(Tarea t) {
        if (totalTareas < MAX_TAREAS) {
            tareas[totalTareas] = t;
            totalTareas++;
            return true;
        }
        return false;
    }

    @Override
    public void mostrarInfo() { // polimorfismo
        System.out.println("Curso: " + getNombre() + " | Codigo: " + codigo + " | Tutor: " + tutor);
        if (totalTareas == 0) {
            System.out.println("   (sin tareas)");
        } else {
            for (int i = 0; i < totalTareas; i++) {
                tareas[i].mostrarInfo();
            }
        }
    }
}