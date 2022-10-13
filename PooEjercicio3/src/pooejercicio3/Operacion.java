/*
A continuación, se deben crear los siguientes métodos:

h)      
 */
package pooejercicio3;


public class Operacion {
    private int numero1;
    private int numero2;
    
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
    }
    
    public int getNumero1 (){
        return numero1;
    }
    
    public int getNumero2 (){
        return numero2;
    }
    
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.    
    
    public void crearOperacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
    public int metodoSumar(){
        int suma = numero1 + numero2;
        return suma;
    }
    
//f) Método restar(): calcular la resta de los números y devolver el resultado al main   
    public int metodoRestar(){
        int resta = numero1 - numero2;
        return resta;
    }
    
/*
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
    */    
    public int metodoMultiplicar(){
        int multiplicar;
        if(numero1 == 0 || numero2 ==0){
            multiplicar = 0;
            System.out.println("Error: multiplo = 0");
        }else{
            multiplicar = numero1 * numero2;
        }
        return multiplicar;
    }
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.  
    public int metodoDividir(){
        int dividir;
        if(numero1 == 0 || numero2 ==0){
            dividir = 0;
            System.out.println("Error: division = 0");
        }else{
            dividir = numero1 / numero2;
        }
        return dividir;
    }
}


