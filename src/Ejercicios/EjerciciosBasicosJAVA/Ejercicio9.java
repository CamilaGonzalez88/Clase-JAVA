package Ejercicios.EjerciciosBasicosJAVA;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;

            default:
                System.out.println("Operador inválido");
        }

        scanner.close();
    }
}