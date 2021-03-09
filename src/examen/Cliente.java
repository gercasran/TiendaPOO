package examen;

/**
 *
* @author Equipo 4 2CM2 POO
 */
public class Cliente {
    private int id;
    private String nombre;
    private Carro carro;
    private Historial historial;
    private Pedido pedido;
    
    public Cliente(int i, String n){
        id = i;
        nombre = n;
        carro = null; 
        historial = null;
        pedido = null;
    }
    
    public void asignarHistorial(Historial h){
        historial = h;
        h.asignarCliente(this);
    }
    
    public void asignarCarro(Carro c){
        carro = c;
        c.asignarCliente(this);
    }
    
    public void asignarPedido(Pedido p){
        pedido = p;
        p.asignarCliente(this);
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

    public Carro getCarro() {
        return carro;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
    
    
}
