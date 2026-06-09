import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajadores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> trabajadores = new ArrayList<>();

        agregarTrabajadores(scanner, trabajadores);

        mostrarTrabajadores(trabajadores);

        eliminarTrabajador(scanner, trabajadores);

        mostrarTrabajadores(trabajadores);

        scanner.close();
    }

    public static void agregarTrabajadores(Scanner scanner, List<String> trabajadores) {

        System.out.print("¿Cuántos trabajadores desea agregar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del trabajador: ");
            String nombre = scanner.nextLine();
            trabajadores.add(nombre);
        }
    }

    public static void eliminarTrabajador(Scanner scanner, List<String> trabajadores) {

        System.out.print("Ingrese el nombre del trabajador a eliminar: ");
        String nombre = scanner.nextLine();

        if (trabajadores.remove(nombre)) {
            System.out.println("Trabajador eliminado correctamente.");
        } else {
            System.out.println("El trabajador no existe en la lista.");
        }
    }

    public static void mostrarTrabajadores(List<String> trabajadores) {

        System.out.println("\nLista de trabajadores:");

        for (String trabajador : trabajadores) {
            System.out.println("- " + trabajador);
        }

        System.out.println("Total de trabajadores: " + trabajadores.size());
    }
}