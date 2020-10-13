

package palabrathis;


/* una clase o paquete en java solo puede contener una clase publica
    el resto de las clases son referenciadas en modificador de acceso como default o package

    el objeto this hace referecia a la clase u objeto en el que este es usado
    esto es debido a que dentro de cada clase se ejecuta el constructor super() de la clase object la cual es la clase padre pata todas las demas clases en java
    es en este momento que la clase objet reserva e espacio de memoria necesario para la clase que estamos ejecutando y por ende inicializamos la misma
    es por esto que this hace referencia a la clase en la que esta se encuentra
*/

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Alexis", "Moraga");
        System.out.println("persona = " + persona);
        
        
       
    }

}


class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("la referencia del objeto es : " + this);
        new Imprimir().inprimir(this);
    }
}

class Imprimir{

    public void inprimir(Persona persona){
        System.out.println("Imprimiendo el objeto : " + persona);
        System.out.println("Imprimiendo el objeto this : " + this);
    }
}
