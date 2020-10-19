
package test;

import proyectofinal.*;


public class TestProyectoFinal {
    
    public static void main(String[] args) {
        
        Monitor monitorHp = new Monitor("HP", 13);
        Teclado tecladoHp = new Teclado("cable", "HP");
        Raton  ratonHp = new Raton("cable", "hp");
        
        
          
        Monitor monitorDell = new Monitor("Dell", 17);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton  ratonDell = new Raton("Bluetooth", "Dell");
        
        
        
        Computadora computadoraHp = new Computadora("Computadora Hp", monitorHp, tecladoHp, ratonHp);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraHp);
        orden1.agregarComputadora(computadoraDell);
        
        orden1.mostrarOrden();
    }

}
