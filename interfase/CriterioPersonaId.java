package interfase;

public class CriterioPersonaId extends Criterio<Persona> {
    public int comparar(Persona a, Persona b){
        if(a.getId()==b.getId())
        {
            return 0;
        }
        if (a.getId()> b.getId())
        {
            return 1;
        }
        return -1;
    }
    
}
