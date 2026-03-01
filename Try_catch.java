package com.mycompany.practica_1;
import java.util.Scanner;

public class Try_catch {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("=== Try catch ===");
            System.out.println("1. Try-Catch Funcional");
            System.out.println("2. Try-Catch No Funcional");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");

            String entrada = sn.nextLine();
            
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Debes insertar un numero en el menu");
                continue;
            }

            switch (opcion) {
                case 1:
                    TryCatchFuncional();
                    break;
                case 2:
                    TryCatchNoFuncional();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 3");
            }
        }
    }

    public static void TryCatchFuncional() {
        Scanner sn = new Scanner(System.in);
        System.out.println("\n--- FUNCIONAL---");
        try {
            System.out.print("Introduce un numero para dividir 10 entre el: ");
            int divisor = Integer.parseInt(sn.nextLine());
            int resultado = 10 / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (NumberFormatException e) {
            System.out.println("Dato invalido.");
        }
    }

    public static void TryCatchNoFuncional() {
        Scanner sn = new Scanner(System.in);
        System.out.println("\n--- NO FUNCIONAL  ---");
        System.out.print("Introduce un numero (0 o letra) para romper el programa: ");
        
        int divisor = Integer.parseInt(sn.nextLine());
        int resultado = 10 / divisor;
        
        System.out.println("Resultado: " + resultado);
    }
}