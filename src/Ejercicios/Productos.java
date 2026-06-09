package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Productos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese un producto: ");
            String producto = scanner.nextLine();

            productos.add(producto);
        }

        System.out.println("\nLista de productos:");

        for(String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nCantidad de productos registrados: " + productos.size());


    }
}