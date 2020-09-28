/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class DatosPrimitivosFlotantes {

    /*
        Se conoce como literal al valor de una variable
        Estos pueden ser de tipo entero o flotante, por defecto en java estas son de tipo entero si no almacenan un punto flotante 
        Si nuetra literal tiene punto flotante por defecto es de tipo doble, para corregir esto añadimos una F mayuscula al final de la literal
    
        existen dos tipos de datos primitivos con punto flotante
        por un lado de encuentran los float, los cuales nos permiten almacenar valores entre  1.4E-45 y 3.4028235E38
        y por otro los doubles, loa cuales nos permiten almacenar valores entre 3.4028235E38 y 1.7976931348623157E308
    */
    public static void main(String args[]){
        
        float numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo de un tipo float "+Float.MIN_VALUE);
        System.out.println("Valor maximo de un tipo float "+Float.MAX_VALUE);
        
        
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo de un tipo double "+Double.MIN_VALUE);
        System.out.println("Valor maximo de un tipo float "+Double.MAX_VALUE);
        
    }
    
}
