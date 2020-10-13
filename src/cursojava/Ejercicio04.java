/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;


import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String args[]){
        var console = new Scanner(System.in);
        
        System.out.println("Proporcione un valor entre 0 y 10");
        var calificacion = Double.parseDouble(console.nextLine());
        
        var valorCalificacion = "Valor desconocido";
        
        if(calificacion >= 9 && calificacion <= 10 ){
            valorCalificacion = "A";
            
        }else if(calificacion >= 8 && calificacion < 9){
        
            valorCalificacion = "B";
            
        }else if(calificacion >= 7  && calificacion < 8 ){
            
            valorCalificacion = "C";
            
        }
        else if(calificacion >= 6  && calificacion < 7 ){
            
            valorCalificacion = "D";
                
        }
        else if(calificacion >= 0  && calificacion < 6 ){
            
            valorCalificacion = "F";
            
        }
        
        System.out.println(valorCalificacion);
                
    }
}
