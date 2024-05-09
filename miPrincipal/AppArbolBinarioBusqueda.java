package miPrincipal;
import arbolBinarioOrdenado.*;
import java.util.Scanner;

public class AppArbolBinarioBusqueda{
   public static void menu() throws Exception{
        Scanner consola = new Scanner(System.in);
        int opc= -1;
        while(opc !=0)
        {
        System.out.println("********************************");
        System.out.println("       ARBOLES BINARIOS         ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Buscar nodo                  ");
        System.out.println("3) Eliminar nodo                ");
        System.err.println();
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
        opc=consola.nextInt();
        switch (opc) {
                case 1:
                    insertarNodo();
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 0:
                System.out.println("BYE!!");
                break;
                
        
            default:
            System.out.println("OPCION INVALIDA!!");
                break;
        }
    }
}
    public static void insertarNodo() {
        ArbolBinario arbol= new ArbolBinario();
        try {
            arbol.insertar2(new Entero(10));
            arbol.insertar2(new Entero(15));
            arbol.insertar2(new Entero( 30)); 
            arbol.insertar2(new Entero( 5));
            arbol.insertar2(new Entero( 2));
            arbol.insertar2(new Entero( 1));
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        }
        System.out.println("Recorrido de arboles :");
        System.out.println();
        System.out.println("Recorrido In Order ");
        arbol.inorden();
        System.out.println();
        System.out.println("Recorrido Pre Order ");
        arbol.preorden();
        System.out.println();
        System.out.println("Recorrido Post Order ");
        arbol.postorden();
        //imprime arbol despues de la insersion
        System.out.println();
        System.out.println("Impresion del arbol :");


}
   
}