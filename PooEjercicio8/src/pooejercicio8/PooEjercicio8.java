/*
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package pooejercicio8;

import entidad.Cadena;
import java.util.Scanner;
import servicio.ServicioPersona;


public class PooEjercicio8 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        ServicioPersona sp = new ServicioPersona();
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        
        sp.mostarVocales(c1);
        sp.invertirFrase(c1);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        sp.vecesRepetido(letra, c1);
        
        System.out.println("Ingrese una frase.");
        frase = leer.next();
        
        sp.compararLongitud(frase, c1);
        
        System.out.println("Ingrese otra frase");
        frase = leer.next();
        
        sp.unirFrases(frase, c1);
        
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        sp.reemplazar(letra, c1);
        
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        sp.contiene(letra, c1);
    }
    
}
