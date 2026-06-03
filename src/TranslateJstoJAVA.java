import java.util.Scanner;

public class TranslateJstoJAVA {

    static Scanner scanner = new Scanner(System.in);

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static String dividir(double num1, double num2) {
        if (num2 == 0) {
            return "No se puede dividir por 0";
        } else {
            return String.valueOf(num1 / num2);
        }
    }

    public static double pedirNumero() {
        while (true) {
            System.out.print("Ingrese un número: ");

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Debe ingresar un número válido");
                scanner.next();
            }
        }
    }

    public static void menu() {

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n### Calculadora ###");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Opción inválida");
                scanner.next();
                continue;
            }

            double num1;
            double num2;

            switch (opcion) {

                case 1:
                    num1 = pedirNumero();
                    num2 = pedirNumero();
                    System.out.println("Resultado: " + suma(num1, num2));
                    break;

                case 2:
                    num1 = pedirNumero();
                    num2 = pedirNumero();
                    System.out.println("Resultado: " + resta(num1, num2));
                    break;

                case 3:
                    num1 = pedirNumero();
                    num2 = pedirNumero();
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;

                case 4:
                    num1 = pedirNumero();
                    num2 = pedirNumero();
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
