

package dominio;

/*
    El encapsulamiento es un concepto que busca restringir el accesoa nuestras propiedades evitando que estas sean publicas y puedan ser accedidas desde cualquier clase
    es por esto que se establecen de forma privada y se crear dos metodos para acceder y manupular sus valores
    estos son los setter y los getters
    los setters nos sirven para acceder al valor de nuestro atributo
    por otro lado los getters nos sirven para modificar el valor de los mismos
*/

public class Persona {

    private String nombre;
    private Double sueldo;
    private Boolean eliminado;
    
    
    
   public Persona(String nombre, Double sueldo, Boolean eliminado ){
       this.nombre = nombre;
       this.sueldo = sueldo;
       this.eliminado = eliminado;
   }
   

    public String getNombre() {
        return nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    public String toString(){
        return "Persona [ nombre: "+this.nombre+
                " , Sueldo : "+this.sueldo+
                " , Eliminado: "+this.eliminado+
                " ]";
    }
   
   
}
