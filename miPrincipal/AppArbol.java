
package miPrincipal;
import java.util.*;
import arbolBinario.*;
public class AppArbol{
    public static void menu(){
        Scanner consola= new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("       ARBOLES BINARIOS         ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Recorrido InOrden            ");
        System.out.println("3) Recorrido PreOrden           ");
        System.out.println("4) Recorrido PostOrden          ");
        System.out.println("5) Buscar nodo                  ");
        System.out.println("6) Eliminar nodo                ");
        System.out.println("7) Altura del árbol             ");
        System.out.println("8) Número de nodos              ");
        System.out.println("9) Número de hojas              ");
        System.out.println("10) Número de nodos internos    ");
        System.out.println("11) Número de nodos con un hijo ");
        System.out.println("12) Número de nodos con dos hijos");
        System.out.println("13) Nivel de un nodo            ");
        System.out.println("14) Nivel del árbol             ");
        System.out.println("15) Mostrar árbol               ");
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
        int opc=consola.nextInt();
        switch (opc) {
            case 1:
                insertarNodo();
                break;
            case 2: 
                recorridoInOrden();
                break;
            case 3: 
                recorridoPreOrden();
                break;
            case 4: 
                recorridoPostOrden();
                break;
            case 0:
                System.out.println("BYEEE");
                break;
        
            default:
                break;
        }
    }
    public static ArbolBinario insertarNodo(){
        //crear un arbol binario 
        ArbolBinario ab= new ArbolBinario();
        Nodo nodoA= new Nodo("A");
        Nodo nodoB= new Nodo("B");
        Nodo nodoC= new Nodo("C");
        Nodo nodoD= new Nodo("D");
        Nodo nodoE= new Nodo("E");
        Nodo nodoF= new Nodo("F");
        Nodo nodoG= new Nodo("G");
        ab.setRaiz(nodoA);
        ab.getRaiz().setIzquierdo(nodoB);
        ab.getRaiz().setDerecho(nodoC);
        nodoB.setIzquierdo(nodoD);
        nodoB.setDerecho(nodoE);
        nodoC.setIzquierdo(nodoF);
        nodoC.setDerecho(nodoG);
        return ab;
    }
    public static void recorridoInOrden(){

    }
    public static void recorridoPreOrden(){
        ArbolBinario ab= insertarNodo();
        System.out.println("~RECORRIDO PRE ORDEN RECURSIVO ~");
        ab.preOrden();
    }
     public static void recorridoPostOrden(){
        
    }
    
}