/*
    Encapsulamiento
    como vimos los atributos de la clase persona estan definidos como privados
    esto nos impide acceder directamente a ellos desde cualquier otra clase o paquete
    para esto usamos los metodos setters y getters definidos para cada uno de los atributos de nuestra clase
 */

package encapsulamiento;

import dominio.Persona;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        Persona juan = new Persona("Juan Carlos", 850.000, false);
        System.out.println("Nombre : " + juan.getNombre());
        
        juan.setNombre("Juan Carlos Bodoque");
        System.out.println("Nombre Modificado : " + juan.getNombre());
        
        
        System.out.println("El registro esta eliminado : " + juan.getEliminado());
        
        System.out.println(juan);
    }
}
