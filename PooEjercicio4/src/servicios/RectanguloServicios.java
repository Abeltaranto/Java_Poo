/*
un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;


public class RectanguloServicios {
    
    private Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base y altura del rectangulo");
        int base = leer.nextInt();
        int altura = leer.nextInt();
        return new Rectangulo(base,altura);    
        
    }
    
    public void calculoSuperficie(Rectangulo datos) {
        int area = datos.getBase()*datos.getAltura();
        System.out.println("el area es: "+ area);
      }
    
    public void calculoPerimetro(Rectangulo datos) {
        int perimetro = (datos.getBase()+datos.getAltura())*2;
        System.out.println("El perimetro del rectángulo es "+perimetro);
    }
          
    public void dibujarRectangulo(Rectangulo datos) {
        int j;
        for (int i = 0; i < datos.getAltura(); i++) {
            for (j = 0; j < datos.getBase(); j++) {
                if (i==0 || i==datos.getAltura()-1 || j==0 || j ==datos.getBase()-1 || i==j || i+j==datos.getBase()-1) {
                    System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
