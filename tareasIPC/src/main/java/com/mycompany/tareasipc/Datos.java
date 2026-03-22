package com.mycompany.tareasipc;



public class Datos {
    private static final int MAX_CURSOS = 10;
    private static Curso[] cursos = new Curso[MAX_CURSOS];
    private static int totalCursos = 0;

    public static boolean agregarCurso(Curso c) {
        if (totalCursos < MAX_CURSOS) {
            cursos[totalCursos] = c;
            totalCursos++;
            return true;
        }
        return false;
    }

    public static Curso getCurso(int index) {
        return cursos[index];
    }

    public static int getTotalCursos() {
        return totalCursos;
    }
}