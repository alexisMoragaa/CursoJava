/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

import java.util.Scanner;

public class Ejercicio3AreaYPerimetro {
    
    public static void main(String args[]){
        
        var consol = new Scanner(System.in);
        
        System.out.println("Ingrese la altura del rectangulo");
        
        var alto = Double.parseDouble(consol.nextLine());
        
        System.out.println("Ingrese el ancho del rectangulo");
        
        var ancho = Double.parseDouble(consol.nextLine());
        
        
        var area = alto * ancho;
        
        var perimetro = (alto + ancho ) * 2;
        
        
        System.out.println("el area de tu rectagulo es "+ area);
        
        System.out.println("El perimetro de tu rectangulo es "+perimetro);
        
    }

}
