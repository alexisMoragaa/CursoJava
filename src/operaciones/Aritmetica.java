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
public class Aritmetica {
    //atributos de nuestra clase
    int a;
    int b;
    
    
    public void sumar(){
        System.out.println(a+b);
    }
    
    
    public int returSuma(){
        return (a+b);
    }
    
    
    public int sumarConArgumentos(int ag1, int ag2){
        return ag1+ag2;
    }
    
}
