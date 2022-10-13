/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
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
package pooejercicio7;

import entidad.Persona;
import servicio.ServicioPersona;

/**
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
public class PooEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();
        
        double pesoBajo = 0;
        double pesoIdeal = 0;
        double sobrepeso = 0;
        double mayor = 0;
        double menor = 0;
        
        if (sp.calcularIMC(p1)==-1) {
            System.out.println(p1.getNombre()+ " tiene bajo peso");
            pesoBajo++;
        }else if(sp.calcularIMC(p1)==0) {
            System.out.println(p1.getNombre()+" tiene peso ideal");
            pesoIdeal++;
        }else if(sp.calcularIMC(p1)==1){
            System.out.println(p1.getNombre()+" tiene sobrepeso");
            sobrepeso++;
        }
        
        if (sp.esMayorDeEdad(p1)==true) {
            System.out.println(p1.getNombre()+" Es mayor de edad");
            mayor++;
        }else{
            System.out.println(p1.getNombre()+" Es menor de edad");
            menor++;
        }
        if (sp.calcularIMC(p2)==-1) {
            System.out.println(p2.getNombre()+ " tiene bajo peso");
            pesoBajo++;
        }else if(sp.calcularIMC(p2)==0) {
            System.out.println(p2.getNombre()+" tiene peso ideal");
            pesoIdeal++;
        }else if(sp.calcularIMC(p2)==1){
            System.out.println(p2.getNombre()+" tiene sobrepeso");
            sobrepeso++;
        }
        
        if (sp.esMayorDeEdad(p2)==true) {
            System.out.println(p2.getNombre()+" Es mayor de edad");
            mayor++;
        }else{
            System.out.println(p2.getNombre()+" Es menor de edad");
            menor++;
        }
        
        if (sp.calcularIMC(p3)==-1) {
            System.out.println(p3.getNombre()+ " tiene bajo peso");
            pesoBajo++;
        }else if(sp.calcularIMC(p3)==0) {
            System.out.println(p3.getNombre()+" tiene peso ideal");
            pesoIdeal++;
        }else if(sp.calcularIMC(p3)==1){
            System.out.println(p3.getNombre()+" tiene sobrepeso");
            sobrepeso++;
        }
        
        if (sp.esMayorDeEdad(p3)==true) {
            System.out.println(p3.getNombre()+" Es mayor de edad");
            mayor++;
        }else{
            System.out.println(p3.getNombre()+" Es menor de edad");
            menor++;
        }
        
        if (sp.calcularIMC(p4)==-1) {
            System.out.println(p1.getNombre()+ " tiene bajo peso");
            pesoBajo++;
        }else if(sp.calcularIMC(p4)==0) {
            System.out.println(p4.getNombre()+" tiene peso ideal");
            pesoIdeal++;
        }else if(sp.calcularIMC(p4)==1){
            System.out.println(p4.getNombre()+" tiene sobrepeso");
            sobrepeso++;
        }
        
        if (sp.esMayorDeEdad(p4)==true) {
            System.out.println(p4.getNombre()+" Es mayor de edad");
            mayor++;
        }else{
            System.out.println(p4.getNombre()+" Es menor de edad");
            menor++;
        }
        
        System.out.println(pesoBajo/4*100+"% de las personas tiene bajo peso.\n"+pesoIdeal/4*100+"% de las personas tienen un peso ideal\n"+sobrepeso/4*100+"% de las personas tienen sobrepeso.");
        System.out.println(menor/4*100+"% de las pesonas son menor de edad.\n"+mayor/4*100+"% de las personas son menor de edad.");
    }
    
}
