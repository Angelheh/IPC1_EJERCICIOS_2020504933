package com.mycompany.tareasipc;


import java.util.Scanner;


public class TareasIPC {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Crear curso");
            System.out.println("2. Agregar tarea a un curso");
            System.out.println("3. Mostrar cursos y tareas");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: crearCurso(); break;
                case 2: agregarTarea(); break;
                case 3: mostrarTodo(); break;
                case 4: System.out.println("Hasta luego."); break;
                default: System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }

    static void crearCurso() {
        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();
        System.out.print("Tutor: ");
        String tutor = sc.nextLine();

        Curso c = new Curso(nombre, codigo, tutor);
        if (Datos.agregarCurso(c)) {
            System.out.println("Curso creado.");
        } else {
            System.out.println("Limite de cursos alcanzado.");
        }
    }

    static void agregarTarea() {
        if (Datos.getTotalCursos() == 0) {
            System.out.println("No hay cursos creados.");
            return;
        }
        for (int i = 0; i < Datos.getTotalCursos(); i++) {
            System.out.println(i + ". " + Datos.getCurso(i).getNombre());
        }
        System.out.print("Selecciona el numero del curso: ");
        int idx = Integer.parseInt(sc.nextLine());

        if (idx < 0 || idx >= Datos.getTotalCursos()) {
            System.out.println("Indice invalido.");
            return;
        }

        System.out.print("Titulo de la tarea: ");
        String titulo = sc.nextLine();
        System.out.print("Descripcion: ");
        String desc = sc.nextLine();
        System.out.print("Fecha de entrega: ");
        String fecha = sc.nextLine();

        Tarea t = new Tarea(titulo, desc, fecha);
        if (Datos.getCurso(idx).agregarTarea(t)) {
            System.out.println("Tarea agregada.");
        } else {
            System.out.println("Limite de tareas alcanzado.");
        }
    }

    static void mostrarTodo() {
        if (Datos.getTotalCursos() == 0) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        for (int i = 0; i < Datos.getTotalCursos(); i++) {
            Datos.getCurso(i).mostrarInfo(); // polimorfismo en acción
            System.out.println("----------------");
        }
    }
}