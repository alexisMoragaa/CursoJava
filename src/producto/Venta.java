

package producto;



public class Venta {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 15.2);
        Producto producto2 = new Producto("Pantalon", 14.3);
        Producto producto3 = new Producto("Chaqueta", 35.3);
        Producto producto4 = new Producto("Bolso", 19);
        
        
        Orden orden1 = new Orden();
        
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        
        
        
        orden1.mostrarOrden();
        
         
    }
    
}
