
package palabrastatic;

/*
    dentro de nuestra clase temos dos contextos, el contexto estatico, y el contexto dinamico
    
    el contexto dinamico, el cual hemos usado hasta ahora hace referencia a los objetos de una clase, ya que estos pueden almacenar su propia informacion
    de forma independiete entre si

    por otro lado existe el contexto estatico, y este esta ligado a la clase como tal, y son valores que pertenecen a la clase, por ende son compartidos por todos los objetos
*/
public class PalabraStatic {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    
    public PalabraStatic(String nombre){
        this.nombre  = nombre;
        
        PalabraStatic.contadorPersonas++;
        this.idPersona = PalabraStatic.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        PalabraStatic.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "PalabraStatic{ " + "idPersona = " + idPersona + ", nombre = " + nombre + '}';
    }

    
    
}
