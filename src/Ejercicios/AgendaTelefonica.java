package colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> agenda = new HashMap<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            agenda.put(nombre, telefono);
        }

        System.out.println("\nContactos registrados:");

        for (var contacto : agenda.entrySet()) {
            System.out.println(
                    contacto.getKey() +
                            " -> " +
                            contacto.getValue());
        }

        System.out.print("\nBuscar contacto: ");
        String buscar = sc.nextLine();

        String telefono = agenda.get(buscar);

        if (telefono != null) {
            System.out.println("Teléfono: " + telefono);
        } else {
            System.out.println("Contacto no encontrado");
        }

        sc.close();
    }
}