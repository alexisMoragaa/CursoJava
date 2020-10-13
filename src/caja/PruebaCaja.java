/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caja;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaCaja {
    
    public static void main(String[] args) {
            
         Caja caja1 = new Caja();
         caja1.alto = 2;
         caja1.ancho = 2;
         caja1.profundo = 2;
         
         var volumenCaja1 = caja1.calcularVolumen();
         System.out.println("volumenCaja1 = " + volumenCaja1);
         
         
         Caja caja2 = new Caja(2,3,4);
         var volumenCaja2 = caja2.calcularVolumen();
         
         System.out.println("volumenCaja2 = " + volumenCaja2);
        
    }
}
