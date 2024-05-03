package arbolBinario;

import pilas.Pila;

public class ArbolBinario{
    private Nodo raiz;
    public ArbolBinario(){
        this.raiz=null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz=raiz;
    }
    public Nodo getRaiz(){
        return this.raiz;
    }
    public void setRaiz(Nodo raiz){
        this.raiz=raiz;
    }
   
    private static  void visitar (Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    //metodo recursivo en pre orden 
    private static void preOrden(Nodo aux){
        while(aux!=null){
            visitar(aux);
            preOrden(aux.getIzquierdo());
            preOrden(aux.getDerecho());
        }
    }
    public  void preOrden(){//metodo publico que invoca al metodo privado recursivo 
        preOrden(raiz);
    }
    private static void inOrden(Nodo aux){
        if(aux!=null){
            inOrden(aux.getIzquierdo());
            visitar(aux);
            inOrden(aux.getDerecho());
        }
    }
    public  void inOrden(){
        inOrden(raiz);
    }
    private void postOrden(Nodo aux){
        if(aux!=null){
            postOrden(aux.getIzquierdo());
            postOrden(aux.getDerecho());
            visitar(aux);
        }

    
    }
    public void postOrden(){
        postOrden(raiz);
    }
    //recorrido iterativo en pre orden utilizando una pila 
    public void preOrdenIterativo(){
        Pila <Nodo> pila = new Pila<Nodo>();
    }
}