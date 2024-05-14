package miPrincipal;
//proposito es demostrar la clase tree set que provee java como un arbol de busqueda binaria 
import java.util.*;
public class DemoClaseTreeSet {
    public static void main(String[] args) {
        //crea el arbol de busqueda 
        TreeSet<Integer> arbolito= new TreeSet<Integer>();
        //insertar algunos elementos 
        arbolito.add(5);
        arbolito.add(3);
        arbolito.add(9);
        arbolito.add(2);
        arbolito.add(2);//no introduce el duplicado lo ignora 
        //mostrar los elementos del arbol
        System.out.println("Muestra los elementos de la colección");
        for(Iterator<Integer>it= arbolito.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }

        //buscar elementos en la coleccion
        System.out.println(arbolito.contains(5));
        System.out.println(arbolito.contains(8));
        //eliminar elementos de la coleccion
        arbolito.remove(5);
        //eliminar elemento que no existe (lo ignora)
        arbolito.remove(5);
        //muestro los elementos del arbolito despues de la eliminacion 
        System.out.println("Muestra los elementos de la colección despues de la eliminacion");
        for(Iterator<Integer>it= arbolito.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }
        //debolver el tamaño de la coleccion
        System.out.println("Size : "+arbolito.size());
        
    }
}
