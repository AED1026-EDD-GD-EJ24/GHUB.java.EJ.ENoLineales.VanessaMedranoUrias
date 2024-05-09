package interfase;

public class CriterioPersonaNombre extends Criterio <Persona>{
    public int comparar(Persona a, Persona b){
        if(a.getNombre().equals(b.getNombre()))
        {
            return 0;
        }
        if (a.getNombre().compareTo(b.getNombre())>0)
        {
            return 1;
        }
        return -1;
    }
    
}
