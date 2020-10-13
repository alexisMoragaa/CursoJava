/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import herencia.Cliente;
import herencia.Empleado;
import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class testHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alexis",100.95);
        System.out.println("empleado1 = " + empleado1);
        
        //boolean vip, Date fechaRegistro, String nombre, char genero, int edad, String direccion
        Date ingreso = new Date();
        Cliente cliente1 = new Cliente(false, ingreso, "Alexis Moraga", 'm' , 27, "Mi casa" );
        
        System.out.println(cliente1);
    }
    
}
