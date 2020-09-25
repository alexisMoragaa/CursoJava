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
public class DatosPrimitivos {
    
    /* En java existen tipos de datos las cuales conoceremos como primitivos
        un ejemplo de estos son las variables de tipo entero, dentro de las cuales podemos encontrar los siguientes tipos de datos primitivos
        byte => permite almacenar valores entre -128 y 127
        short => permite almacenar valores entre -32768 y 32767
        int => permite almacenar valores entre -2147483648 y 2147483647
        long
    */
    public static void main(String args[]){
        
        //ejemplo de datos byte
        byte numByte = 100;
        System.out.println("numByte = " + numByte);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE );
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE );
        
        
       //ejemplo de short
       short numShort = 100;
        System.out.println("numShort = " + numShort);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        
        
        //ejemplo con int
        int numInt = 100;
        System.out.println("numInt = " + numInt);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        
        
        //ejemplo long
        long numLong = 100;
        System.out.println("numLong = " + numLong);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        
       
    }
}

