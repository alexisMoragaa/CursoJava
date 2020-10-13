/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        Aritmetica suma = new Aritmetica();
        suma.a = 2;
        suma.b = 6;
        int resultado = suma.returSuma(); 
        System.out.println("resultado = " + resultado);
        
        
        var res = suma.sumarConArgumentos(2, 7);
        
        System.out.println("res = " + res);
    }
    

}
