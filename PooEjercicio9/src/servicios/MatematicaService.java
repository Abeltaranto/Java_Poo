
package servicios;

import entidades.Matematica;


public class MatematicaService {
    
    /*
    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    */
    public double devolverMayor(Matematica m) {
        return Math.max(m.getNum1(),m.getNum2());
    }
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    */
    public double calcularPotencia(Matematica m) {
        return  Math.round(Math.pow(Math.max(m.getNum1(), m.getNum2()), Math.min(m.getNum1(), m.getNum2())));
    }
    /*
    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public int calculaRaiz(Matematica m) {
        return (int)Math.sqrt(Math.min(m.getNum1(), m.getNum2()));
    }
}
