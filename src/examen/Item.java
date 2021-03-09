package examen;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Item {
    private Producto producto;
    private Carro carro;
    private int cantidad;
    
    public Item(Producto p, int c){
        
        cantidad = c;
        producto = p;
        //producto.setDisponibilidad(producto.getDisponibilidad()-cantidad); SERVIRÍA PARA COMPRAR AL FINAL (QUITA DE STOCK LA CANTIDAD DE ITEM)
        carro = null;
    }
    
    public String compra(int c){
        if(producto.getDisponibilidad() < c){
            return("\nNo hay stock de: " + producto.getNombre() + "\n");
        }else{
            producto.setDisponibilidad(producto.getDisponibilidad()-c);
            return("Compra realizada de: " + producto.getNombre() + "\n");
        }        
    }
    
    public void asignarCarro(Carro c){
        carro = c;   
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String infoProducto(){
        return( this.producto.getId() + " " +
                this.producto.getNombre() +  ": " +
                this.producto.getDescripcion() + 
                this.producto.getDisponibilidad());
    }
    
    public String infoCarro(){
        return( this.producto.getId() + ". " + this.producto.getNombre() +  " - " +
                this.cantidad + "\n");
    }
    
    public String infoCarro1(){
        return(this.producto.getNombre() +  " - " +
                this.cantidad + "\n");
    }
    
}
