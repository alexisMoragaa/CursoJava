/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]){
    
        var console = new Scanner(System.in);
        
        System.out.println("Ingrese el valor para el numero a");
        var a = Integer.parseInt(console.nextLine());
        
        System.out.println("Ingrese el valor para el numero b");
        var b = Integer.parseInt(console.nextLine());
        
        var mayor = 0;
        
        if(a > b)
            mayor = a;   
        else
            mayor = b;
 
            
            System.out.println("El numero mayor es " + mayor);
        
    }
}
