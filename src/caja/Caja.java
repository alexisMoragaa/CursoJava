

package caja;


public class Caja {

    int alto;
    int ancho;
    int profundo;
    
    public Caja(){
    }
    
    public Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    
    
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
}
