import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        //agregar elementos
        nombres.add("Seba");
        nombres.add("JuaN");
        nombres.add("Maria");
        System.out.println(nombres);

        //Acceder a elementos
        //System.out.println(nombres.get(numeroquequiero));
        //System.out.println(nombres.getLast()); ultimo de la lista
        //System.out.println(nombres.getFirst()) el primero

        //Modificar elementos
        nombres.set(1,"Ricardo");
        System.out.println(nombres.get(1));

        //Eliminar elementos
        //nombres.remove(0); //elimina por el indice
        nombres.remove("Seba"); //por el valor
        System.out.println(nombres.get(0));

        //tamaño de la lista (dinamico)
        System.out.println(nombres.size());


        List<Integer> numeros= new ArrayList<>();

        for(int  i = 1; i<5; i++){
            numeros.add(i);
        }
        System.out.println(numeros);

        for(int i= 0; i < nombres.size();i++){
            System.out.println(nombres.get(i)); //se recorre la lista y me da los datos del numero de posicion de la lista

        }




    }
}
