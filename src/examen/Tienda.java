package examen;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4 2CM2 POO
 */
public class Tienda {
    public static void main(String[] args) {
        int o1 = 0;
        int o2 = 0;
        int o3 = 0;
        int o4 = 0;
        int o5 = 0;
        boolean valida;
        boolean valida1;
        String cat;
        int i;
        Cajas caja1 = new Cajas();
        ArrayList <Cliente> clientes = new ArrayList();
        ArrayList <Producto> catalogo = new ArrayList();
        //admin
        catalogo.add(new Producto(1,"nombre1","desc1",20));
        catalogo.add(new Producto(2,"nombre2","desc2",20));
        catalogo.add(new Producto(3,"nombre3","desc3",20));
        catalogo.add(new Producto(4,"nombre4","desc4",20));
        catalogo.add(new Producto(5,"nombre5","desc5",20));
        catalogo.add(new Producto(6,"nombre6","desc6",20));
        catalogo.add(new Producto(7,"nombre7","desc7",20));
        catalogo.add(new Producto(8,"nombre8","desc8",20));
        catalogo.add(new Producto(9,"nombre9","desc9",20));
        catalogo.add(new Producto(10,"nombre10","desc10",20));
        //admin
        clientes.add(new Cliente(1,"Luis Garcia"));
        clientes.get(0).asignarCarro(new Carro());
        clientes.get(0).asignarHistorial(new Historial());
        clientes.get(0).asignarPedido(new Pedido());
        clientes.add(new Cliente(2,"María Cruz"));
        clientes.get(1).asignarCarro(new Carro());
        clientes.get(1).asignarHistorial(new Historial());
        clientes.get(1).asignarPedido(new Pedido());
        clientes.add(new Cliente(3,"Bruno Cortés"));
        clientes.get(2).asignarCarro(new Carro());
        clientes.get(2).asignarHistorial(new Historial());
        clientes.get(2).asignarPedido(new Pedido());
        
        do{
            caja1.setCadena("Escomazon\n"
                    + "1. Cliente 1: " + clientes.get(0).getNombre() + " - " +
                    clientes.get(0).getCarro().cantidades() + " productos" 
                    + "\n2. Cliente 2: " + clientes.get(1).getNombre() + " - " +
                    clientes.get(1).getCarro().cantidades()+ " productos" 
                    + "\n3. Cliente 3: " + clientes.get(2).getNombre() + " - " +
                    clientes.get(2).getCarro().cantidades()+ " productos"  + "\n4. Salir");
            caja1.mostrarOpciones();
            o1 = Integer.parseInt(caja1.getInput());
            Cajas caja2 = new Cajas();
            Cajas caja3 = new Cajas();
            Cajas caja4 = new Cajas();
            Cajas caja5 = new Cajas();
            switch(o1){
                case 1: //cliente 1
                    caja2.setCadena("Elige una opción \n1. Mostrar carro" +
                            "\n2. Agregar al carro \n3. Vaciar el carro \n4. Hacer pedido \n5. Historial \n6. Log out");
                    caja2.mostrarOpciones();
                    o2 = Integer.parseInt(caja2.getInput());
                    
                    do{
                        valida = false;
                        switch(o2){
                            case 1: //Mostrar carro
                                //Mostrar contenido de carro
                                if(clientes.get(0).getCarro().getArticulos().size() == 0){
                                    caja3.setCadena("El carro del cliente 1 está vacío\nElige una opcion "
                                            + "\n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }else{
                                    caja3.setCadena("Contenido del carro del cliente 1 \n" + clientes.get(0).getCarro().contenido() +
                                            "\nElige una opcion \n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                valida1 = false;
                                do{
                                    
                                    switch(o3){
                                        case 1: //Quitar producto
                                            if(clientes.get(0).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 1 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 1 \n" + clientes.get(0).getCarro().indice() +
                                                            "\nElige que producto quitar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                clientes.get(0).getCarro().quitar(clientes.get(0).getCarro().getArticulos().get(o4-1));
                                                valida1 = true;
                                            }
                                            break;
                                        case 2: //Cambiar cantidad
                                            if(clientes.get(0).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 1 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 1 \n" + clientes.get(0).getCarro().indice() +
                                                            "\nElige que producto cambiar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                caja5.setCadena("Producto elegido: \n" + 
                                                        clientes.get(0).getCarro().getArticulos().get(o4-1).infoCarro1() +
                                                            "\nElige que cantidad");
                                                caja5.mostrarOpciones();
                                                o5 =  Integer.parseInt(caja5.getInput());
                                                clientes.get(0).getCarro().cambiar(o4-1, o5);
                                                valida1 = true;
                                            }                                            
                                            break;
                                        case 3: //Regresar
                                            valida = true;
                                            valida1 = true;
                                            break;
                                        default:
                                            caja4.setTexto("Elige una opción valida");
                                            caja4.mostrarDialogo();
                                            valida1 = true;
                                            break;
                                    }
                                }while(valida1 == false);
                                break;
                            case 2: //Agregar a carro
                                //Mostrar Catalogo y elegir producto
                                for(i = 1; i <= 10; i++){
                                    cat = catalogo.toString();
                                    caja3.setCadena("Agregar a carro, elegir producto \n" + cat
                                    + "\nElige un producto");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() == 0){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja4.setCadena("Producto elegido: " + catalogo.get(o3-1).getNombre() + " \nElige la cantidad");
                                }
                                caja4.mostrarOpciones();
                                o4 = Integer.parseInt(caja4.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() < o4){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    clientes.get(0).getCarro().agregar(catalogo.get(o3-1), o4);
                                    valida = true;
                                }
                                break;
                            case 3: //Vaciar carro
                                clientes.get(0).getCarro().vaciar();
                                caja3.setTexto("Carro vaciado");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            case 4: //Hacer pedido
                                if(clientes.get(0).getCarro().getArticulos().size() == 0){
                                    caja3.setTexto("El carro del cliente 1 está vacío");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Contenido carro:\n"+ clientes.get(0).getCarro().contenido() + 
                                            clientes.get(0).getCarro().comprar());
                                    caja3.mostrarDialogo();
                                    clientes.get(0).getPedido().setArticulos(clientes.get(0).getCarro().getArticulos());
                                    clientes.get(0).getHistorial().agregar(clientes.get(0).getPedido().getArticulos());
                                    clientes.get(0).getCarro().vaciar();
                                    valida = true;
                                }
                                break;
                            case 5: //Historial de pedido
                                if(clientes.get(0).getHistorial().getLista().size() == 0){
                                    caja3.setTexto("El cliente 1 no ha hecho pedidos");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Historial de pedidos del cliente 1: \n" + clientes.get(0).getHistorial().contenido());
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }
                                break;
                            case 6:
                                caja3.setTexto("Sesión cerrada");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            default:
                                //caja que diga opcion invalida
                                caja3.setTexto("Opcion invalida");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                        }
                    }while(valida == false);
                    break;
                case 2: //cliente 2
                    caja2.setCadena("Elige una opción \n1. Mostrar carro" +
                            "\n2. Agregar al carro \n3. Vaciar el carro \n4. Hacer pedido \n5. Historial \n6. Log out");
                    caja2.mostrarOpciones();
                    o2 = Integer.parseInt(caja2.getInput());
                    
                    do{
                        valida = false;
                        switch(o2){
                            case 1: //Mostrar carro
                                //Mostrar contenido de carro
                                if(clientes.get(1).getCarro().getArticulos().size() == 0){
                                    caja3.setCadena("El carro del cliente 2 está vacío\nElige una opcion "
                                            + "\n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }else{
                                    caja3.setCadena("Contenido del carro del cliente 2 \n" + clientes.get(1).getCarro().contenido() +
                                            "\nElige una opcion \n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                valida1 = false;
                                do{
                                    
                                    switch(o3){
                                        case 1: //Quitar producto
                                            if(clientes.get(1).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 2 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 2 \n" + clientes.get(1).getCarro().indice() +
                                                            "\nElige que producto quitar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                clientes.get(1).getCarro().quitar(clientes.get(1).getCarro().getArticulos().get(o4-1));
                                                valida1 = true;
                                            }
                                            break;
                                        case 2: //Cambiar cantidad
                                            if(clientes.get(1).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 2 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 2 \n" + clientes.get(1).getCarro().indice() +
                                                            "\nElige que producto cambiar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                caja5.setCadena("Producto elegido: \n" + 
                                                        clientes.get(1).getCarro().getArticulos().get(o4-1).infoCarro1() +
                                                            "\nElige que cantidad");
                                                caja5.mostrarOpciones();
                                                o5 =  Integer.parseInt(caja5.getInput());
                                                clientes.get(1).getCarro().cambiar(o4-1, o5);
                                                valida1 = true;
                                            }                                            
                                            break;
                                        case 3: //Regresar
                                            valida = true;
                                            valida1 = true;
                                            break;
                                        default:
                                            caja4.setTexto("Elige una opción valida");
                                            caja4.mostrarDialogo();
                                            valida1 = true;
                                            break;
                                    }
                                }while(valida1 == false);
                                break;
                            case 2: //Agregar a carro
                                //Mostrar Catalogo y elegir producto
                                for(i = 1; i <= 10; i++){
                                    cat = catalogo.toString();
                                    caja3.setCadena("Agregar a carro, elegir producto \n" + cat
                                    + "\nElige un producto");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() == 0){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja4.setCadena("Producto elegido: " + catalogo.get(o3-1).getNombre() + " \nElige la cantidad");
                                }
                                caja4.mostrarOpciones();
                                o4 = Integer.parseInt(caja4.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() < o4){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    clientes.get(1).getCarro().agregar(catalogo.get(o3-1), o4);
                                    valida = true;
                                }
                                break;
                            case 3: //Vaciar carro
                                clientes.get(1).getCarro().vaciar();
                                caja3.setTexto("Carro vaciado");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            case 4: //Hacer pedido
                                if(clientes.get(1).getCarro().getArticulos().size() == 0){
                                    caja3.setTexto("El carro del cliente 2 está vacío");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Contenido carro:\n"+ clientes.get(1).getCarro().contenido() + 
                                            clientes.get(1).getCarro().comprar());
                                    caja3.mostrarDialogo();
                                    clientes.get(1).getPedido().setArticulos(clientes.get(1).getCarro().getArticulos());
                                    clientes.get(1).getHistorial().agregar(clientes.get(1).getPedido().getArticulos());
                                    clientes.get(1).getCarro().vaciar();
                                    valida = true;
                                }
                                break;
                            case 5: //Historial de pedido
                                if(clientes.get(1).getHistorial().getLista().size() == 0){
                                    caja3.setTexto("El cliente 2 no ha hecho pedidos");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Historial de pedidos del cliente 2: \n" + clientes.get(1).getHistorial().contenido());
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }
                                break;
                            case 6:
                                caja3.setTexto("Sesión cerrada");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            default:
                                //caja que diga opcion invalida
                                caja3.setTexto("Opcion invalida");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                        }
                    }while(valida == false);
                    break;
                case 3: //cliente 3
                    caja2.setCadena("Elige una opción \n1. Mostrar carro" +
                            "\n2. Agregar al carro \n3. Vaciar el carro \n4. Hacer pedido \n5. Historial \n6. Log out");
                    caja2.mostrarOpciones();
                    o2 = Integer.parseInt(caja2.getInput());
                    
                    do{
                        valida = false;
                        switch(o2){
                            case 1: //Mostrar carro
                                //Mostrar contenido de carro
                                if(clientes.get(2).getCarro().getArticulos().size() == 0){
                                    caja3.setCadena("El carro del cliente 3 está vacío\nElige una opcion "
                                            + "\n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }else{
                                    caja3.setCadena("Contenido del carro del cliente 3 \n" + clientes.get(2).getCarro().contenido() +
                                            "\nElige una opcion \n1. Quitar producto\n2. Cambiar cantidad\n3. Regresar");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                valida1 = false;
                                do{
                                    
                                    switch(o3){
                                        case 1: //Quitar producto
                                            if(clientes.get(2).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 3 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 3 \n" + clientes.get(2).getCarro().indice() +
                                                            "\nElige que producto quitar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                clientes.get(2).getCarro().quitar(clientes.get(2).getCarro().getArticulos().get(o4-1));
                                                valida1 = true;
                                            }
                                            break;
                                        case 2: //Cambiar cantidad
                                            if(clientes.get(2).getCarro().getArticulos().size() == 0){
                                                caja4.setTexto("El carro del cliente 3 está vacío\n");
                                                caja4.mostrarDialogo();
                                                valida1 = true;
                                            }else{
                                                caja4.setCadena("Contenido del carro del cliente 3 \n" + clientes.get(2).getCarro().indice() +
                                                            "\nElige que producto cambiar");
                                                caja4.mostrarOpciones();
                                                o4 =  Integer.parseInt(caja4.getInput());
                                                caja5.setCadena("Producto elegido: \n" + 
                                                        clientes.get(2).getCarro().getArticulos().get(o4-1).infoCarro1() +
                                                            "\nElige que cantidad");
                                                caja5.mostrarOpciones();
                                                o5 =  Integer.parseInt(caja5.getInput());
                                                clientes.get(2).getCarro().cambiar(o4-1, o5);
                                                valida1 = true;
                                            }                                            
                                            break;
                                        case 3: //Regresar
                                            valida = true;
                                            valida1 = true;
                                            break;
                                        default:
                                            caja4.setTexto("Elige una opción valida");
                                            caja4.mostrarDialogo();
                                            valida1 = true;
                                            break;
                                    }
                                }while(valida1 == false);
                                break;
                            case 2: //Agregar a carro
                                //Mostrar Catalogo y elegir producto
                                for(i = 1; i <= 10; i++){
                                    cat = catalogo.toString();
                                    caja3.setCadena("Agregar a carro, elegir producto \n" + cat
                                    + "\nElige un producto");
                                }
                                caja3.mostrarOpciones();
                                o3 = Integer.parseInt(caja3.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() == 0){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja4.setCadena("Producto elegido: " + catalogo.get(o3-1).getNombre() + " \nElige la cantidad");
                                }
                                caja4.mostrarOpciones();
                                o4 = Integer.parseInt(caja4.getInput());
                                if(catalogo.get(o3-1).getDisponibilidad() < o4){
                                    caja4.setTexto("No hay stock de " + catalogo.get(o3-1).getNombre());
                                    caja4.mostrarDialogo();
                                    valida = true;
                                }else{
                                    clientes.get(2).getCarro().agregar(catalogo.get(o3-1), o4);
                                    valida = true;
                                }
                                break;
                            case 3: //Vaciar carro
                                clientes.get(2).getCarro().vaciar();
                                caja3.setTexto("Carro vaciado");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            case 4: //Hacer pedido
                                if(clientes.get(2).getCarro().getArticulos().size() == 0){
                                    caja3.setTexto("El carro del cliente 3 está vacío");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Contenido carro:\n"+ clientes.get(2).getCarro().contenido() + 
                                            clientes.get(2).getCarro().comprar());
                                    caja3.mostrarDialogo();
                                    clientes.get(2).getPedido().setArticulos(clientes.get(2).getCarro().getArticulos());
                                    clientes.get(2).getHistorial().agregar(clientes.get(2).getPedido().getArticulos());
                                    clientes.get(2).getCarro().vaciar();
                                    valida = true;
                                }
                                break;
                            case 5: //Historial de pedido
                                if(clientes.get(2).getHistorial().getLista().size() == 0){
                                    caja3.setTexto("El cliente 3 no ha hecho pedidos");
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }else{
                                    caja3.setTexto("Historial de pedidos del cliente 3: \n" + clientes.get(2).getHistorial().contenido());
                                    caja3.mostrarDialogo();
                                    valida = true;
                                }
                                break;
                            case 6:
                                caja3.setTexto("Sesión cerrada");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                            default:
                                //caja que diga opcion invalida
                                caja3.setTexto("Opcion invalida");
                                caja3.mostrarDialogo();
                                valida = true;
                                break;
                        }
                    }while(valida == false);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
