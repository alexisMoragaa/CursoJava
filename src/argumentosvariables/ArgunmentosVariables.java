

package argumentosvariables;

/*
    Argumentos Variables
    los argumentos variables consisten en una sintaxis la cual nos permite ejecutar un metodo sin conocer el numero de argumentos que este necesita
    estos argumentos son entregados al metodo como un array, es por esto que podemos acceder a propiedades como length
    si usamos varios parametros nuestro parametro variable siempre es el ultimo

    los parametros variables internamente son tratados como un array
    
*/

public class ArgunmentosVariables {

    public static void main(String[] args) {
        
        
        
            variosParametros("Alexis", 8,5,7,5,8);
        
        
        imprimirNumeros(3,4,5);
        imprimirNumeros(6,7,8,9,10,11);
    }
    
    
    private static void imprimirNumeros(int... numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Elementos: " + numeros[i]);
        }
        
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("el nombre es: " + nombre);
        imprimirNumeros(numeros);
    }
}
