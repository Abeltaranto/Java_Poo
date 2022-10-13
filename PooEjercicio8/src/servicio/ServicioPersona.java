
package servicio;

import entidad.Cadena;
import java.util.Scanner;


public class ServicioPersona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
    */
    public void mostarVocales(Cadena c) {
        String[] vector = new String [5];
        int contadorVocal = 0;
        vector[0]="a";
        vector[1]="e";
        vector[2]="i";
        vector[3]="o";
        vector[4]="u";
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String vocal = c.getFrase().substring(i, i+1);
            for (int j = 0; j < 5; j++) {
                if (vocal.equalsIgnoreCase(vector[j]))
                    contadorVocal ++;
            }
        }
        System.out.println("La frase tiene "+contadorVocal+" vocales.");

    }
    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena c) {
        String fraseInv = "";
        for (int i = c.getLongitud(); i > 0; i--) {
        fraseInv = fraseInv+(c.getFrase().substring(i-1, i));
        }
        System.out.println("La frase al revés es '"+fraseInv+"'.");
    }
    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    public void vecesRepetido(String letra, Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c.getFrase().substring(i, i+1))) {
                contador ++;
            }
        }
        System.out.println("El carácter '"+letra+"' se repite "+contador+" veces en la frase.");
    }
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(String frase, Cadena c) {
        int resultado = c.getLongitud()-frase.length();
        if (resultado<0) {
            System.out.println("La longitud de la frase ingresada es mayor que la original");
        }else if (resultado ==0) {
            System.out.println("La longitud de la frase ingresada es igual que la original");
        }else {
            System.out.println("La longitud de la frase ingresada es menor que la original");
    }
    }
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrases(String frase, Cadena c) {
        System.out.println("La frase resultante es: "+frase+c.getFrase());
    }
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.
    */
    public void reemplazar(String letra, Cadena c) {
        String frase2 = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            String frase = c.getFrase().substring(i, i+1);
            if (frase.equalsIgnoreCase("a")) {
                frase = letra;
            }
            frase2 = frase2+frase;
        }
        System.out.println(frase2);
    }
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public void contiene(String letra, Cadena c) {
        boolean bandera = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c.getFrase().substring(i, i+1))) {
                bandera = true;
            }
        }
        System.out.println(bandera);
    }
}
