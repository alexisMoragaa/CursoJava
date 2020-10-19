

package bloquesdeinicializacion;

/*
    Los bloques de inicializacion son fragentos de codigo que se ejecutan antes del constructor de la clase
    existen dos tipos de bloques de inicializacion, los estaticos y los no estaticos
*/
public class Persona {
    
    private final int idPersona;
    private static int contadorPersona;
    
    /*
        Este es un ejemplo de un bloque estatico, estos son los primeros en ejecutarse y lo hacen apenas la clase esta cargada en memoria
        Al ser un bloque estatico este no puede acceder a las propiedades no estaticas como idPersona
    */
    static{
        System.out.println("Ejecucion de bloque estatico");
        ++Persona.contadorPersona;
    }
    
    /*
        Este es un ejemplo de un bloque no estatico, estos bloques son cargados justo despues de que se ejecutan los estaticos y antes que el constructor de la clase
        
    */
    
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    
    
    public Persona(){
        System.out.println("Ejecucion del constructor de la clase");
    }
    
    
 
   
   
    
}
