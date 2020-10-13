
package herencia;

/*
    para heredar las propiedades o metodos de una clase padre en java basta con añadir la palabra reservada extends seguida del nombre de la clase desde la cual deseamos heredar

    por defecto en java heredamos las propiedades y los metodos, mas no los constructores
    para poder instanciar un nuevo objeto de la clase padre usamos super dentro del constructor
    con esto usamos el constructor de la clase hijo en conjunto con el constructor de la clase padre, y de  esta forma logramos crear objetos de la clase empleado instanciado las propiedades de su clase padre
 
*/
public class Empleado extends Persona {

     private int idEmpleado;
     private double sueldo;
     private static int contadorEmpleado;


    
    public Empleado(String nombre,  double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        Empleado.contadorEmpleado++;
        this.idEmpleado = contadorEmpleado;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" , Empleado{idEmpleado} = ").append(this.idEmpleado);
        sb.append(", sueldo = ").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
     
     
}
