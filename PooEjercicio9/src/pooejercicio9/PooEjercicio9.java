
package pooejercicio9;

import entidades.Matematica;
import servicios.MatematicaService;


public class PooEjercicio9 {


    public static void main(String[] args) {
        Matematica m = new Matematica();
        m.setNum1(Math.round(Math.random()*100));
        m.setNum2(Math.round(Math.random()*100));
        MatematicaService ms = new MatematicaService();
        
        System.out.println("El mayor entre "+m.getNum1()+" y "+m.getNum2()+" es: "+ms.devolverMayor(m));
        System.out.println("El calculo de potencia es: "+ms.calcularPotencia(m));
        System.out.println("El calculo de la raiz es: "+ms.calculaRaiz(m));
    }
    
    
}
