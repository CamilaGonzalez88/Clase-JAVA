package Ejercicios.EjerciciosBasicosJAVA;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        scanner.close();
    }
}
