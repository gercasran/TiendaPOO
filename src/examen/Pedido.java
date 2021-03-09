package examen;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Pedido {
     private ArrayList <Item> articulos = new ArrayList();
     private Cliente cliente;
     
    public void asignarCliente(Cliente c){
        cliente = c;
    }
     
    public ArrayList<Item> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Item> articulos) {
        int i;
        ArrayList <Item> a = new ArrayList();
        for(i = 0; i<articulos.size(); i++){
            a.add(articulos.get(i));
        }
        this.articulos = a;
    }
     
    
    public String contenido(){
        int j;
        String s = "";
        for(j = 0; j<this.articulos.size(); j++){
            s += this.articulos.get(j).infoCarro();
        }
        return(s);
    }
     
}

