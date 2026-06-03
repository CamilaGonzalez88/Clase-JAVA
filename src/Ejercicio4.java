import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double montoDescuento = precio * descuento / 100;
        double precioFinal = precio - montoDescuento;

        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

        scanner.close();
    }
}
