
package test;

import enumeraciones.*;


public class TestEnumeracion {
    
    public static void main(String[] args) {
        
        diaSemana(Enumeracion.DOMINGO);
        
        
        var continente = Continentes.AFRICA;
        var paises = continente.getPaises();
        var poblacion = continente.getPoblacion();
        
        System.out.println("Continente  = " + continente);
        System.out.println("paises = " + paises);
        System.out.println("poblacion = " + poblacion);
        
        
        
        
        
    }
    
    
    private static void diaSemana(Enumeracion enumeracion){
        
        switch(enumeracion){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
                
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Primer dia del fin de semana");
            case DOMINGO:
                System.out.println("Utimo dia de la semana");
                break;
                
        }
                
        System.out.println("El dia de la semana es  " + enumeracion );
    }
}
