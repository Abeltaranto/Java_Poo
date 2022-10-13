/*
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicio;

import entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    public void llenarCafetara (Cafetera medidas) {
        medidas.setCantidadActual(medidas.getCapacidadMaxima());
    }
    
    /*
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
    */
    
    public void servirTaza(int tamanoTaza, Cafetera c) {
        if (tamanoTaza <= c.getCantidadActual()) {
            c.setCantidadActual(c.getCantidadActual()-tamanoTaza);
            System.out.println("Se sirvió la taza de "+ tamanoTaza+" ml.\nQuedan "+c.getCantidadActual()+" ml. de cafe.");
        }else{
            System.out.println("La taza se completará en "+c.getCantidadActual()+" ml.");
            c.setCantidadActual(0);
        }
    }
    
    public int tamanoTaza() {
        System.out.println("Ingrese el tamaño de la taza.");
        int taza =leer.nextInt();
        return taza;
    }
    
    public void vaciarCafetera (Cafetera c) {
        c.setCantidadActual(0);
    }
    

}
