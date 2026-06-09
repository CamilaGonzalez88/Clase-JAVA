import java.util.Scanner;

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Cammi"; //definir variable siempre
        final String CONTRASENIA = "1234";
        System.out.println(" Mi nombre es "+ nombre);
        System.out.println("Longitud: " + nombre.length()); // longitud de largo del string
        System.out.println("Caracter: " + nombre.charAt(3)); // indice de la palabra, para obtener una letra en especial del string
        System.out.println("Minúscula:" + nombre.toLowerCase()); //minuscula
        System.out.println("Mayúscula:" + nombre.toUpperCase()); //mayuscula
        System.out.println(nombre.contains("mm")); // si contiene dicho string o dato en el codigo concatenado

        System.out.println(nombre == "Cammi");
        System.out.println(nombre.equals("CAMMI")); //buena practica "equals" para comparar string

        // PROMPT de JAVA
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa una contraseña: ");
        String contraseniaIngresada = consola.nextLine();
        System.out.println(CONTRASENIA.equalsIgnoreCase(contraseniaIngresada));
    }
}
