/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;


import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String args[]){
        
        var consola = new Scanner(System.in);
        
        System.out.println("Proporcione el nomre:");
        var nombreLibro = consola.nextLine();
        
        System.out.println("Proporciona el id:");
        var idLibro = consola.nextLine();
        
        System.out.println("Proporciona el precio");
        var precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(consola.nextLine());
        
        
        
        System.out.println(nombreLibro);
        
        System.out.println(idLibro);
        
        System.out.println(precio);
        
        System.out.println(envio);
        
    }
    

}
