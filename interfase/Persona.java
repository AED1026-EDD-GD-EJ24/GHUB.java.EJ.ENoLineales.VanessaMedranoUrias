package interfase;

public class Persona implements Comparable <Persona> {
    private int id;
    private String nombre;
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Persona() {
        this(0,"");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    @Override
    public int compareTo(Persona o) {
        if(this.nombre.compareTo(o.getNombre())<0)
        {
            return -1;
        }
        if(this.nombre.compareTo(o.getNombre())>0)
        {
            return 1;
        }
        return 0;
    }
   
}