
package pooejercicio5;

import Servicios.CuentaServicio;
import entidades.Cuenta;
import java.util.Scanner;


public class PooEjercicio5 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Servicios.CuentaServicio cs = new CuentaServicio();
        
        Cuenta c1 = cs.crearCuenta();
        cs.ingresar(cs.ingreso(),c1);
        cs.retirar(cs.retiro(), c1);
        cs.extracccionRapida(c1);
        cs.consultarSaldo(c1);
        cs.consultarDatos(c1);
        
    }
    
}
