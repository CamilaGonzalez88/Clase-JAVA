import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        int edad = 2026 - anioNacimiento;

        System.out.println("\nHola " + nombre + ", tienes aproximadamente " + edad + " años.");

        scanner.close();
    }
}