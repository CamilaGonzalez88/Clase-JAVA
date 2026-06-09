import java.util.ArrayList;
import java.util.Scanner;

public class Frutas {

    public static void agregarFrutas(ArrayList<String> frutas, Scanner scanner) {
        System.out.print("¿Cuántas frutas desea agregar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la fruta " + (i + 1) + ": ");
            frutas.add(scanner.nextLine());
        }
    }

    public static void mostrarFrutas(ArrayList<String> frutas) {
        System.out.println("\nLista de frutas:");

        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }

    public static void mostrarCantidad(ArrayList<String> frutas) {
        System.out.println("\nCantidad de frutas: " + frutas.size());
    }

    public static void reemplazarFruta(ArrayList<String> frutas, Scanner scanner) {
        System.out.print("\nIngrese la fruta que desea reemplazar: ");
        String frutaVieja = scanner.nextLine();

        if (frutas.contains(frutaVieja)) {
            System.out.print("Ingrese la nueva fruta: ");
            String frutaNueva = scanner.nextLine();

            int indice = frutas.indexOf(frutaVieja);
            frutas.set(indice, frutaNueva);

            System.out.println("Fruta reemplazada correctamente.");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    public static void eliminarFruta(ArrayList<String> frutas, Scanner scanner) {
        System.out.print("\nIngrese la fruta que desea eliminar: ");
        String fruta = scanner.nextLine();

        if (frutas.contains(fruta)) {
            frutas.remove(fruta);
            System.out.println("Fruta eliminada correctamente.");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>();

        agregarFrutas(frutas, scanner);

        mostrarFrutas(frutas);

        mostrarCantidad(frutas);

        reemplazarFruta(frutas, scanner);

        eliminarFruta(frutas, scanner);

        System.out.println("\nResultado final:");

        mostrarFrutas(frutas);

        scanner.close();
    }
}