/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursojava;


public class OperadoresDeAsignacion {
    
    public static void main(String args[]){
        // operadores de asignacion, tanto en java como en otros lenguajes existen estos operadores
        
        /*
            El mas comun de ellos es =  este nos sirve para asignar un valor a una variable u objeto
            Ademas de este existen los operadores compuestos, los cuales nos ayudaran a realizar operaciones y asignar el resulado de estas operaciones a  una variable
        */
        
        var a = 1; // operador de asignacion simple
        
         a += 2; // operador de asignacion compuesto, este indica que a ahora vale su valor anterior + 2
         
         // est tipo de operadores compuesto se puede aplicar al resto de operaciones logicas dentro de java, ya sean estas sumas, restas, multiplicaciones, divisiones o productos
         
         
         
         // OPERADORES UNARIOS
         
         var b = 3;
         var c = -a; // este operador nos sirve para cambiar el signo de nuestras variables
         
         var d = true;
         var e = !d; // este operador solo sirve para los valores booleanos, y al igual que en el caso anterior nos sirve para cambiar los signos de nuestras variables
         
         //preincremento
         var f = 3;
         System.out.println("f = " + f);
         var j = ++f; // al hacer un preincremento lo que estamos haciendo es primero aumentar en 1 el valor de la variablej, y posteriormente sumando el valor de la variable e
         System.out.println("j = " + j);
         //POSTINCREMENTO
         
         var g = 3;
         System.out.println("g = " + g);
         var h = g++; // primero usamos el valor de la variable y despues realizamos el incremento
         System.out.println("h = " + h);
         
        
         
         
         // operadores de compracion o igualdad
          var r = 3;
          var t = 2;
          var q = (r == t); // usamos == para realizar una comparacion de igualdad sobre dos valores
          
          
          var s = (r != t); //usamos != para realizar una comparacion de diferencia entre dos valores
         
          
          // para comprarar si el contenido de dos cadenas es igual usamos el metodo equals del objeto de tipo string
          
          var saludo = "Hola";
          var despedida = "Adios";
          
          var comparacion = saludo.equals(despedida);
          
          System.out.println("comparacion = " + comparacion);
          
          
          
          
           
         
    }
}
