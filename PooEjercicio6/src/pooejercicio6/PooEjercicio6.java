
package pooejercicio6;

import entidades.Cafetera;
import servicio.CafeteraServicio;


public class PooEjercicio6 {


    public static void main(String[] args) {
        
        Cafetera c = new Cafetera(1000);
        CafeteraServicio cs = new CafeteraServicio();
        
        cs.llenarCafetara(c);
        
        System.out.println(c);
        
        cs.servirTaza(cs.tamanoTaza(),c);
        
    }
    
}
