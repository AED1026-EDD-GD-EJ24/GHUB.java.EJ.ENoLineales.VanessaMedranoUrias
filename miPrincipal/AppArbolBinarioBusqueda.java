package miPrincipal;
import arbolBinarioOrdenado.*;
import java.util.Scanner;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =-1;
        do{
            System.out.println();
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.println("Selecciona opción:");
            opc=consola.nextInt();
            switch(opc){
                case 1:
                    insertarNodo();
                    break;

                case 2:
                    buscarNodo();
                    break;
                case 3:
                    eliminarNodos();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                   System.out.println("Opcion inválida");

            }
        } while (opc != 0);
    }
    public static void insertarNodo(){
        System.out.println("~~Insertar nodos ~~");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            
            

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
        System.out.println("RECORRIDO DE ARBOLES:");
        System.out.println("\n Recorrido Inorden");
        arbol.inorden();
        System.out.println("\n Recorrido Preorden");
        arbol.preorden();
        System.out.println("\n Recorrido Postorden");
        arbol.postorden();
        //Imprime el arbol depues de la inserción
        System.out.println("\n IMPRESION DEL ARBOL:");
        BTreePrinter.printNode(arbol.getRaiz());

    }
    public static void eliminarNodos(){
        System.out.println("~~Eliminar nodos ~~");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            System.out.println("Elimina el nodo que solamente tiene un hijo");
            System.out.println("Eliminar el 1 que es una hoja ");
            arbol.eliminar(new Entero(1));
            System.out.println("Mostrar el arbol despues de la eliminacion");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("elimino 5 que solamente tiene hijo izquierdo ");
            arbol.eliminar(new Entero(5));
            System.out.println("Muestro el arbol despues de la eliminacion ");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("elimino 40 que solamente tiene hijo derecho  ");
            arbol.eliminar(new Entero(40));
            System.out.println("Muestro el arbol despues de la eliminacion ");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Elimino el 10 que tiene hijo izquiero y derecho");
            arbol.eliminar(new Entero(10));
            System.out.println("Muestro el arbol despues de la eliminacion ");
            BTreePrinter.printNode(arbol.getRaiz());

            //inserto algunos nodos
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(-5));
            arbol.insertar(new Entero(-3));
            System.out.println("Muestro el arbol despues de insertar ");
            BTreePrinter.printNode(arbol.getRaiz());

            //eliminar la raiz que es 2 
            arbol.eliminar(new Entero(2));
            System.out.println("Muestro el arbol despues de la eliminacion ");
            BTreePrinter.printNode(arbol.getRaiz());

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
        
    }
    public static void buscarNodo(){
        System.out.println("~~Buscar nodos ~~");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            arbol.inorden();
            System.out.println("\n Recorrido Preorden");
            arbol.preorden();
            System.out.println("\n Recorrido Postorden");
            arbol.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Busco el dato 5");
            System.out.println("Elemento buscado 5 "+arbol.buscar(new Entero(5)).getValor());
            System.out.println("Busco elemento que no existe");
            System.out.println("Elemento buscado 50 "+arbol.buscar(new Entero(50)).getValor());

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }

    }
}