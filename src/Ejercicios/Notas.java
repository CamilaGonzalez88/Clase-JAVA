package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Notas {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(3.5);
        notas.add(4.0);
        notas.add(5.2);
        notas.add(2.8);
        notas.add(6.1);
        notas.add(4.7);

        System.out.println("Notas aprobadas:");

        notas.stream()
                .filter(nota -> nota >= 4.0)
                .forEach(System.out::println);

        long cantidadAprobadas = notas.stream()
                .filter(nota -> nota >= 4.0)
                .count();

        System.out.println("\nCantidad de aprobadas: " + cantidadAprobadas);
    }
}