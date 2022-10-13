/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooejercicio1;

import Entidades.Libro;
import java.util.Scanner;


public class PooEjercicio1 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del Primer libro");
        Libro libro1 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        
         System.out.println(libro1.isbn+" "+libro1.titulo+" "+libro1.autor+" "+libro1.numPaginas);
    }
    

    
}
