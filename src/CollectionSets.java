import java.util.HashSet;
import java.util.Set;

public class CollectionSets {
    public static void main(String[] args) {

            Set<String> nombres = new HashSet<>(); //no es ordenada la lista

             nombres.add("Seba");
             nombres.add("JuaN");
             nombres.add("Maria");
             nombres.add("Ricardo");
             nombres.add("Vanesa");
             nombres.add("Felipe");
             nombres.add("Laura");

             System.out.println(nombres);

             //con set las listas son desordenadas y no permite duplicados en valores

             System.out.println(nombres.contains("JuaN")); // verificar existencia de algo


            //eliminar elementos
        nombres.remove("JuaN");
        System.out.println(nombres);

        //Acceder a elementos de set mediante ForEach
        for(String nombre : nombres){
            System.out.println(nombre);

        }

        //tamaño de la coleccion
        System.out.println(nombres.size());













    }
}
