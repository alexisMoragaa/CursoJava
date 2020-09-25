/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author Alexis Moraga
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Edad = 27;// variable de tipo entero 
        String nombre = "Alexis";

        System.out.println("Mi nombre es " + nombre + " y mi edad es " + Edad);

        //var - podemos usar var para inferir el tipo de la variable en funcion del valor de la misma
        var apellido = "Moraga";

        System.out.print("Mi Nombre es ");
        System.out.println(nombre + " " + apellido);
        System.out.println("Y tengo " + Edad + " Años"); 
        
        
        // Clase Scanner
        // lo primero que necesitamos es realizar e import desde java.util de la clase scanner
        Scanner consola = new Scanner(System.in);

        // ejercicio de la clase
        System.out.println("Proporciona el titulo:");
        var titulo = consola.nextLine();
        
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        
        System.out.println(titulo+" Fue escrito por "+autor);
        
        

    }

}
