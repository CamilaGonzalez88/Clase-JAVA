package Ejercicios.EjerciciosBasicosJAVA;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una nota (1.0 a 7.0): ");
        double nota = scanner.nextDouble();

        if (nota >= 1.0 && nota <= 3.9) {
            System.out.println("Reprobado");
        } else if (nota >= 4.0 && nota <= 5.9) {
            System.out.println("Aprobado");
        } else if (nota >= 6.0 && nota <= 7.0) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota fuera de rango");
        }

        scanner.close();
    }
}
