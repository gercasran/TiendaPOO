package examen;
import javax.swing.JOptionPane;

/**
 *
* @author Equipo 4 2CM2 POO
 */

public class Cajas{

    private String input;
    private String titulo;
    private String texto;
    private String cadena;
    boolean opcionvalida;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public String getInput() {
        return input;
    }
    public void mostrarDialogo(){
        JOptionPane.showMessageDialog(null,this.texto,this.titulo,JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarOpciones(){
        do{
            opcionvalida = false;
            input = JOptionPane.showInputDialog(this.cadena);
            if(input == null){
                JOptionPane.showMessageDialog(null,"Para salir usa la opcion dentro del programa","Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                switch(input){
                    case "":
                        JOptionPane.showMessageDialog(null,"Para salir usa la opcion dentro del programa","Advertencia",JOptionPane.WARNING_MESSAGE);
                    break;
                    default:
                        opcionvalida = true;
                    break;
                }
            }
        }while(opcionvalida == false);
    }
}