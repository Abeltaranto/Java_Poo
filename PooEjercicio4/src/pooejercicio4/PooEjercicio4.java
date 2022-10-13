
package pooejercicio4;

import entidades.Rectangulo;
import servicios.RectanguloServicios;

public class PooEjercicio4 {


    public static void main(String[] args) {
        
      RectanguloServicios rs = new RectanguloServicios();
      Rectangulo r1 = rs.crearRectangulo();
      
      rs.calculoSuperficie(r1);
      rs.calculoPerimetro(r1);
      rs.dibujarRectangulo(r1);
    }
    
    
}
