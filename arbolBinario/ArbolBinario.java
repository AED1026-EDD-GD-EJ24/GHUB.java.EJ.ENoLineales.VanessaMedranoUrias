package arbolBinario;
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
}