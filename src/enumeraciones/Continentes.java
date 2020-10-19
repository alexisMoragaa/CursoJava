

package enumeraciones;

/*
    Las enumeraciones a su vez pueden tener propiedades como en el caso de las clases
    para crear propiedades en nuestras enumeraciones las añadimos entre parentecis separadas por comas
    si creamos propiedades necesitamos crear un constructor en el cual se inicializan estas propiedades
    y los respectivos metodos geter y seter para acceder y modificar los valores respectivamente

*/

public enum Continentes {
    AFRICA(53, 50.759364),
    EUROPA(48, 95.55556),
    ASIA(32, 36.95423),
    AMERICA(63, 98.25641),
    OCEANIA(66, 152.05252);
    
    private final int paises;
    private final double poblacion;
    
    
    Continentes(int paises, double poblacion){
        this.paises = paises;
        this.poblacion = poblacion;
    }
    
    
    public int getPaises(){
        return this.paises;
    }
    
    
    public double getPoblacion(){
        return this.poblacion;
    }
}
