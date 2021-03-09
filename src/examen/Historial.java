/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Historial {
    private ArrayList <Pedido> lista = new ArrayList();
    private Cliente cliente;
    
    public Historial(){
        cliente = null;
    }
    
    public void asignarCliente(Cliente c){
        cliente = c;
    }
    
    public void agregar(ArrayList <Item> i){
        Pedido p1 = new Pedido();
        p1.setArticulos(i);
        lista.add(p1);
    }
    
    public String contenido(){
        int j;
        String s = "";
        for(j = 0; j<lista.size(); j++){
            s += lista.get(j).contenido();
        }
        return(s);
    }

    public ArrayList<Pedido> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pedido> lista) {
        this.lista = lista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
