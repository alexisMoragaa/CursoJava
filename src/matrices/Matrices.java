

package matrices;

import herencia.Persona;

public class Matrices {
    
    public static void main(String[] args) {
        int edades[][] = new int[2][3];
        
        edades[0][0] = 5;
        edades[0][1] = 4;
        edades[0][2] = 3;
        
        edades[1][0] = 2;
        edades[1][1] = 1;
        edades[1][2] = 0;
        
        
        
        for (int ren = 0; ren < edades.length; ren++) {
            
            for (int col = 0; col < edades[ren].length; col++) {
                
                System.out.println(edades[ren][col]);
            }
            
        }
        
        
        
        String frutas[][] =  {{"Naranja", "Limon"}, {"Freza", "Zarzamora"} };
        
        imprimir(frutas);
        
        
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Alexis");
        personas[0][1] = new Persona("Bastian");
        personas[0][2] = new Persona("Carlos");
        
        personas[1][0] = new Persona("Arturo");
        personas[1][1] = new Persona("Andres");
        personas[1][2] = new Persona("Moises");
        
        
        imprimir(personas);
        
        
        
    }
    
    
    
    /* cuando pasamos una matriz como parametro no es necesario indicar el tamaño de la misma
       esto es debido a que se pasa como parametro al referencia en memoria de la matriz, como lo vimos en el capitulo de paso por referencia
    */
    public static void  imprimir(Object matriz[][]){
        
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren+"-"+col+" = "+matriz[ren][col]);
            }
        }
    }

}
