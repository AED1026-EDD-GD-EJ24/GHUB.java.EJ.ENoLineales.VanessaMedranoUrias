package miPrincipal;
import arbolAVL.*;
import arbolAVL.Entero;

import java.util.Scanner;
import arbolBinarioOrdenado.*;
public class AppArbolAVL{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =-1;
        while(opc!=0){
        System.out.println("********************************");
        System.out.println("       ARBOLES AVL              ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Buscar nodo                  ");
        System.out.println("3) Eliminar nodo                ");
        System.out.println("4) Mostrar árbol               ");
        System.err.println();
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
        
        }
        opc=consola.nextInt();
        switch (opc) {
            case 1:
                insertarNodo();
                break;
            case 2:
                buscarNodo();
                break;
            case 3:
                eliminarNodos();
                break;

        
            default:
                break;
        }
    }
    public static void insertarNodo(){
        System.out.println("~~Insertar nodos ~~");
        ArbolAVL arbolito = new ArbolAVL();
        try {
            //insertar algunos elementos 
            arbolito.insertar(new Entero(2));
            arbolito.insertar(new Entero(4));
            arbolito.insertar(new Entero(6));
          //  BTreePrinter.printNode(arbolito.getRaiz());
          arbolito.getRaiz();
          
        } catch (Exception e) {
           System.out.println("Error "+e.getMessage());
        }
    }
    public static void eliminarNodos(){
        System.out.println("~~Eliminar nodos ~~");
    }
    public static void buscarNodo(){
        System.out.println("~~Buscar nodos ~~");
    }
}
