/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

import clases.Persona;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
         Persona persona1 = new Persona();
         persona1.nombres = "Alexis";
         
         System.out.println("Nombre = " + persona1.nombres);
         
         cambioNombre(persona1);
         
         System.out.println("Nombre Cmabiado = " + persona1.nombres);
    }
    
    public static void cambioNombre(Persona persona1){
        persona1.nombres = "Alexis Antonio";
    }
        
}
