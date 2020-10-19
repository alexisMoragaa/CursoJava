
package arreglos;

/*
    Los arreglos en java no pueden crecer de forma dinamica
    es decir, declaramos el tamaño de nuestro arreglo en la creacion, y posterior a esto no podemos modificar el tamaño del mismo
*/
public class Arreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        
        System.out.println("edades = " + edades);
        
        edades[0] = 22;
        edades[1] = 24;
        edades[2] = 33;
        
        System.out.println("edades = " + edades[0]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("El valor del arreglo es :" + edades[i]);
        }
    }
}
