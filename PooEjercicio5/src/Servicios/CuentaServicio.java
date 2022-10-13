/*
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import entidades.Cuenta;
import java.util.Scanner;


public class CuentaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese su cuenta, DIN y saldo");
        int cuenta = leer.nextInt();
        long dni = leer.nextLong();
        int saldo = leer.nextInt();
        return new Cuenta(cuenta,dni,saldo);
    }
    
    public void ingresar(double ingreso, Cuenta cta){
        cta.setSaldoActual(cta.getSaldoActual()+(int)ingreso);
    }
    
    public double ingreso (){
        System.out.println("Indique cantidad de dinero a ingresar");
        return leer.nextDouble();
    }
    
    public void retirar (double retiro, Cuenta cta){
        if ((int)retiro <= cta.getSaldoActual()) {
            cta.setSaldoActual(cta.getSaldoActual()-(int)retiro);
            System.out.println("Usted retiró $ "+retiro+"\nSu nuevo saldo es $ "+cta.getSaldoActual());
        }else{
            System.out.println("No dispone de $ "+retiro+" para retirar\nUsted retiró $ "+cta.getSaldoActual()+"");
            cta.setSaldoActual(0);
            System.out.println("Su nuevo saldo es"+cta.getSaldoActual());
        } 
    }
    
    public double retiro(){
        System.out.println("Indique dinero a retirar");
        return leer.nextDouble();
    }
    /*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
    
    public void extracccionRapida(Cuenta saldo){
        System.out.println("Extracion Rapida: Indique importe a retirar");
        int importe = leer.nextInt();
        if (validarSaldo(importe, saldo)) {
            System.out.println("Usted retira $ "+importe);
            saldo.setSaldoActual(saldo.getSaldoActual()-importe);
            System.out.println("Su nuevo saldo es $ "+saldo.getSaldoActual());
        }else{
            System.out.println("Retiro no autorizado");
        }
    }
    
    public boolean validarSaldo(int importe, Cuenta saldo){
        return importe <= saldo.getSaldoActual()*0.2;
    }
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta saldo) {
        System.out.println("Su saldo disponible es: "+saldo.getSaldoActual());
    }
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos (Cuenta datos) {
        System.out.println(datos);
    }
}
