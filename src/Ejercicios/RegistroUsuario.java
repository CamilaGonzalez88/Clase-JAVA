package colecciones;

import java.util.HashSet;
import java.util.Scanner;

public class RegistroUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> usuarios = new HashSet<>();

        System.out.print("¿Cuántos usuarios desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese usuario: ");
            String nombre = sc.nextLine();

            boolean agregado = usuarios.add(nombre);

            if (!agregado) {
                System.out.println("Usuario repetido");
            }
        }

        System.out.println("\nUsuarios únicos:");

        for (String usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\nTotal usuarios únicos: " + usuarios.size());

        sc.close();
    }
}
