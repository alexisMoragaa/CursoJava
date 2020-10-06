/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

import java.util.Scanner;

public class ConversionesDeDatos {
    
    public static void main(String args[]){
        /* Podemos  convertir tipos de datos en otros tipos de datos
            Acontinuacion veremos algunos ejemplos de conversiones de string a tipos numeroscos
        */
        
        // CONVERSIONES DE STRING A ENTEROS
        var edad = Integer.parseInt("20"); // usamos el metodo parseInt de la clase Integer para realizar la conversion de una cadena a un numero entero
        System.out.println("edad = " + (edad + 1));
        
        
        var ValorPi = Double.parseDouble("3.1416"); // podemos usar el metodo parseDouble de la clase Double para realizar la conversion de una cadena a un entero de tipo double
        System.out.println("ValorPi = " + ValorPi);
        
        
        //usando la clase scanner podemos obtener informacion desde la consola, y esta podemos transformala a un  numero entero
        var consola = new Scanner(System.in);
//        System.out.println("Ingrese su edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        
        // CONVERSIONES DE ENTEROS A STRING
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Ingresa un Caracter");
        
        caracter = consola.nextLine().charAt(0);
        
        System.out.println("caracter = " + caracter);
    }
}
