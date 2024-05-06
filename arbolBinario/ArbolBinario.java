package arbolBinario;

import pilas.Pila;
import colas.*;
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
    private void preOrden(Nodo aux){
        if(aux !=null){
            visitar(aux);
            preOrden(aux.getIzquierdo());
            preOrden(aux.getDerecho());

        }
    }
    public  void preOrden(){//metodo publico que invoca al metodo privado recursivo 
        preOrden(raiz);
    }
    private void inOrden(Nodo aux){
        if(aux !=null){
            inOrden(aux.getIzquierdo());
            visitar(aux);
            inOrden(aux.getDerecho());
        }
    }
    public  void inOrden(){
        inOrden(raiz);
    }
    private void postOrden(Nodo aux){
        if(aux !=null){
            postOrden(aux.getIzquierdo());
            postOrden(aux.getDerecho());
            visitar(aux);
        }
    }
    public void postOrden(){
        postOrden(raiz);
    }
    //recorrido iterativo en pre orden utilizando una pila 
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while(!pila.esVacia()){
            Nodo aux= pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho()!=null)
            {
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo()!=null)
            {
                pila.apilar(aux.getIzquierdo());
            }
        }
    }
    //Recorrido iterativo en InOrden , utilizando una pila 
    public void inOrdenIterativo(){
        Pila<Nodo>pila= new Pila<Nodo>();
        pila.apilar(raiz);
        Nodo aux=raiz.getIzquierdo();
        while(aux!=null || !pila.esVacia()){
            if(aux!=null)
            {
                pila.apilar(aux);
                aux=aux.getIzquierdo();
            }
             else 
             {
                aux=pila.cima();
                pila.retirar();
                visitar(aux);
                aux=aux.getDerecho();
            }

        }
    }
    //Recorrido iterativo en PostOrden, utilizando pila
    public void postOrdenIterativo (){
        Pila <Nodo> pila = new Pila<Nodo>();
        Nodo aux=raiz;
        Nodo q= raiz;
        while(aux!=null){
            //avanza por la izquierda y apila los nodos 
            while(aux.getIzquierdo()!=null){
                pila.apilar(aux);
                aux=aux.getIzquierdo();
            }
            while(aux!=null && aux.getDerecho()==null || aux.getDerecho()==q){
                visitar(aux);
                q=aux;
                if(pila.esVacia())
                {
                    return;
                }
                aux=pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux=aux.getDerecho();
        }
    
    }
    public void recorridoPorNivel(){
        Cola <Nodo> cola= new Cola<Nodo>();
        cola.encolar(raiz);
        while(!cola.esVacia()){
            
        }
    }

}