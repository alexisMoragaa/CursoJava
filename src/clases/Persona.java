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
public class Persona {
    
    public String nombres;
    public String apellidos;
    
    public void desplegarInformacion(){
        
        System.out.println("Nombres = " + nombres);
        System.out.println("Apellidos = " + apellidos);
    }

}
