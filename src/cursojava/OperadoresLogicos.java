/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class OperadoresLogicos {

    public static void main(String args[]){
        
        int a =3, b =2;
        
        var suma = a+b; //operador de suma
        
        System.out.println("suma = " + suma);
        
        var resta = a - b; // operador de resta
        System.out.println("resta = " + resta);
        
        var multiplicacion =  a *b; // operador de multiplicacion
        System.out.println("multiplicacion = " + multiplicacion);
        
        var division = a/b; //operador de division
        System.out.println("division = " + division);
        
        
        var residuo = a% b; // operador de modulo o residuo
        System.out.println("residuo = " + residuo);
        
        if(b % 2 == 0) // condicional para determinar si un numero es par o impar
            System.out.println("Es un Numero Par");
        else
            System.out.println("Es un Numero Impar");
    }
}
