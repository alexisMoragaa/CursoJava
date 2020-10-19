

package proyectofinal;




public class Orden {
    private int idOrden;
    private static int contadorOrden;
    private Computadora computadoras[];
    
    private  int contadorComputadora;
    private static final int maxComputadoras = 10;
  
    
    
    
    public Orden(){
        this.idOrden = ++contadorOrden;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    
    
   public void agregarComputadora(Computadora computadora){
       if(this.contadorComputadora < Orden.maxComputadoras){
           this.computadoras[this.contadorComputadora++] = computadora;
       }else{
           System.out.println("Exede el maximo de computadoras por orden");
       }
   }
   
   
   
   public void mostrarOrden(){
       
       System.out.println("Numero de orden: " + this.idOrden);
       System.out.println("Lista de computadoras: ");
       
       for (int i = 0; i < this.contadorComputadora; i++) {
           System.out.println(this.computadoras[i]);
       }
   }
    
}
