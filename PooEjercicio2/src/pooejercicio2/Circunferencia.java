/*
d) Método area(): para calcular el área de la circunferencia (Area = Pi ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ Pi ∗ radio).
 */

package pooejercicio2;

import static java.lang.Math.pow;


public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia (){
        
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia (double radio){
        this.radio = radio;
    }
    
    public double calcularArea (){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularPerimetro (){
        double perimetro = Math.PI * radio * 2;
        return perimetro;
    }
}




