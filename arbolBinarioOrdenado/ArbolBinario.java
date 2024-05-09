package arbolBinarioOrdenado;
import pilas.Pila;
import colas.Cola;

public class ArbolBinario{
    private Nodo raiz;
    public ArbolBinario(){
        this.raiz = null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    
    }
    public Nodo getRaiz(){
        return this.raiz;
    }
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }
    
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    /*
     * Método recursivo en pre-orden
     */
    private void preorden(Nodo aux){
        if(aux !=null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());

        }
    }
    public void preorden(){
        preorden(raiz); //se invoca al método recursivo
    }

    //Método recursivo inOrden
    private void inorden(Nodo aux){
        if(aux !=null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }

    public void inorden(){
        inorden(raiz);
    }

    //Método recursivo postOrden
    private void postorden(Nodo aux){
        if(aux !=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    public void postorden(){
        postorden(raiz);
    }

    //Recorrido Iterativo en Preorden, utilizando una pila
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho() !=null)
               pila.apilar(aux.getDerecho());
            if(aux.getIzquierdo() !=null)
               pila.apilar(aux.getIzquierdo());
        }
    }

    //Recorrido  Iterativo en InOrden, utilizando una pila
    public void inordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while(aux != null || !pila.esVacia()){
            if(aux !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }

    }

    //Recorrido Iterativo en PostOrden, utilizando una pila
    public void postordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while(aux !=null){
            //avanza por la izquierda y apila los nodos
            while(aux.getIzquierdo() !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            while (aux !=null && (aux.getDerecho() == null || aux.getDerecho() == q)){
                visitar(aux);
                q = aux;
                if (pila.esVacia())
                  return;

                aux = pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
    }
    public void recorridoPorNivel(){
        Cola<Nodo> cola = new Cola<Nodo>();
        cola.encolar(raiz);
        while(!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            
            if(aux.getIzquierdo()!=null)
               cola.encolar(aux.getIzquierdo());
            if(aux.getDerecho() !=null)
               cola.encolar(aux.getDerecho());
            cola.desencolar();

        }

    }
    //insercion de nodo version iterativa 
    public void insertar (Object valor)throws Exception{
        Comparable dato= (Comparable)valor;
        Nodo nuevo= new Nodo();
        nuevo.setValor(dato);

        if(raiz==null){
            raiz=nuevo;
        }
        else{
            //anterior hacereferencia alpadre de aux
            Nodo anterior=null;
            //aux es un auxiliar que vartecorriendo los nodos desde raiz
            Nodo aux= raiz;
            while(aux!=null){
                anterior=aux;
                if(dato.esMenor(aux.getValor())){
                    aux=aux.getIzquierdo();
                }
                if(dato.esMayor(aux.getValor())){
                    aux=aux.getDerecho();
                }
                else{
                    throw new Exception("Dato duplicado");
                }
                if(dato.esMenor(anterior.getValor())){
                    anterior.setIzquierdo(nuevo);
                }else{
                    anterior.setDerecho(nuevo);
                }
            }
        }
    }

   //Version recursiva de insertar
   public void insertar2(Object valor) throws Exception{
    Comparable dato = (Comparable)valor;
    raiz = insertarRec(raiz, dato);
}

private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
    if(raizSub == null)
       //caso base, termina la recursividad
       raizSub = new Nodo(dato);
    else{
        if (dato.esMenor(raizSub.getValor())){
            Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
            raizSub.setIzquierdo(iz);

        }else{
            if(dato.esMayor(raizSub.getValor())){
                Nodo dr = insertarRec(raizSub.getDerecho(),dato);
                raizSub.setDerecho(dr);
            }
            else{
                 
               throw new Exception("Nodo duplicado");
            }
        }
    }
    return raizSub;
}




}