/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in);
    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M u O.
Si no es correcto se deberá mostrar un mensaje
    */
    
    public Persona crearPersona () {
        System.out.println("Ingrese nombre, edad, sexo(H,M u O), peso y altura de la persona");
        String nombre = leer.next();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        System.out.println("ingrese sexo");
        String sexo = "";
        do {
            sexo = leer.next();
            if (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("H")&&!sexo.equalsIgnoreCase("O")) {
                System.out.println(sexo+" no es una opción válida, por favor ingrese H,M u O.");
            } 
        } while (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("H")&&!sexo.equalsIgnoreCase("O"));
        System.out.println("ingrese peso");
        int peso = leer.nextInt();
        System.out.println("ingrese altura");
        double altura = leer.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mts)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    public int calcularIMC(Persona p) {
        double imc = p.getPeso()/Math.pow(p.getAltura(), 2);
        int valorImc;
        if (imc < 20) {
            valorImc = -1;
        }else if(imc >= 20 && imc <= 25){
            valorImc = 0;
        }else{
            valorImc = 1;
        }
        return valorImc;
    }
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
    */
    public boolean esMayorDeEdad (Persona p) {
        return p.getEdad() >= 18;
    }
}
