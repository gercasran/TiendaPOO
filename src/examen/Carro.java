package examen;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Carro {
    private Cliente cliente;
    private ArrayList <Item> articulos = new ArrayList();
    
    public Carro(){
        cliente = null;
        //articulos = null;
    }
    
    public void asignarCliente(Cliente c){
        cliente = c;
    }
    
    public void agregar(Producto p, int cantidad){
        Item i = new Item(p,cantidad);
        i.asignarCarro(this);
        articulos.add(i);
    }
    
    public void quitar(Item i){
        articulos.remove(i);
    }
    
    public void cambiar(int i, int c){
        articulos.get(i).setCantidad(c);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getArticulos() {
        return articulos;
    }
    
    public String noArticulos(){
        return(String.valueOf(this.articulos.size()));
    }
    
    public void vaciar(){
        this.articulos.clear();
    }
    
    public String comprar(){
        int j;
        String s = "";
        for(j = 0; j<this.articulos.size(); j++){
            s += this.articulos.get(j).compra(this.articulos.get(j).getCantidad());
        }
        return s;
    }
    
    public String contenido(){
        int j;
        String s = "";
        for(j = 0; j<this.articulos.size(); j++){
            s += this.articulos.get(j).infoCarro();
        }
        return(s);
    }
    
    public String indice(){
        int j;
        String s = "";
        for(j = 0; j<this.articulos.size(); j++){
            s += String.valueOf(j+1) + ". " + this.articulos.get(j).infoCarro1();
        }
        return(s);
    }
    
    public String cantidades(){
        int j, k;
        k = 0;
        for(j = 0;j<this.articulos.size();j++){
            k += this.articulos.get(j).getCantidad();
        }
        return(String.valueOf(k));
    }

    public void setArticulos(ArrayList<Item> articulos) {
        this.articulos = articulos;
    }
    
    
    
    
    
}
