package colas;
public class Nodo<T>{
    //el nodo tiene 2 atributos privados

    private T valor;//almacena la referencia al obj que se guarda en el nodo
    private Nodo <T> siguiente;//hace una referencia al siguiente nodo enlazado

    //constructor por defecto 
    public Nodo(){
        valor=null;
        siguiente=null;
    }
    //devuelve el valor
    public T getValor(){
        return valor;
    }
    //modifica el valor
    public void setValor(T valor){
        this.valor=valor;
    }
    //devuleve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente ){
        this.siguiente=siguiente;
    }
    
}