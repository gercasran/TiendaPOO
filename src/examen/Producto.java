package examen;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int disponibilidad;
   

    public Producto(int i, String n, String d, int ds){
        id = i;
        nombre = n;
        descripcion = d;
        disponibilidad = ds;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    
    public String toString(){
        return("\n"+ this.id + ". " + this.nombre + ": \n" + this.descripcion + " - " + this.disponibilidad + " disponibles");
    }
}
