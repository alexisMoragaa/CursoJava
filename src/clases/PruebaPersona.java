/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona maria = new Persona();
        maria.nombres = "Maria Antonieta";
        maria.apellidos = "De Las Nieves";
        
        maria.desplegarInformacion();
        
        
        System.out.println(maria);
        
    }
} 
