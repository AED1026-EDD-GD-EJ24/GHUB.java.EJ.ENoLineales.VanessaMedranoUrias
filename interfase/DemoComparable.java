package interfase;

import interfase.CriterioPersonaId;

public class DemoComparable {

    public static void main(String[] args) {
        CriterioPersonaId cpid=new CriterioPersonaId();
        Persona p1 = new Persona(20,"Ana");
        Persona p2 = new Persona(10,"Beatriz");

        if(cpid.comparar(p1, p2)>0)
        {
            System.out.println(p1+" es mayor que "+p2);
        }
        else{
            System.out.println(p1+" no es mayor que "+p2);
        }

        CriterioPersonaNombre cpn= new CriterioPersonaNombre();
        if(cpn.comparar(p1, p2)>0)
        {
            System.out.println(p1+" es mayor que "+p2);
        }
        else{
            System.out.println(p1+" no es mayor que "+p2);
        }

        
    }
    
}
