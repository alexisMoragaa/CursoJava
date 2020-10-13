/*
    No es posible acceder a metodos no estaticos desde un metodo estatico
    no podemos acceder al objeto this desde un metodo estatico
    los metodos estaticos estan asociados a la clase en la que se encuentrar y no a los objetos
 */
package palabrastatic;


public class Test {

    public static void main(String[] args) {

        PalabraStatic persona1 = new PalabraStatic("JUAN Carlos");
        PalabraStatic persona2 = new PalabraStatic("JUAN Carlos");

        //System.out.println(persona1);
        imprimir(persona1);
        
        imprimir(persona2);
        //System.out.println(persona2);

    }
    
    public static void imprimir(PalabraStatic persona){
        System.out.println(persona);
    }
}
