package producto;

import producto.Producto;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contOrden;
    private int contadorProductos;
    private static final int Max_productos = 10;

    public Orden() {
        this.idOrden = ++Orden.contOrden;
        this.productos = new Producto[Orden.Max_productos];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.Max_productos) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se alcanzo el maximo de productos");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            total += productos[i].getPrecio();
        }

        return total;

    }
    
    
    public void mostrarOrden(){
        System.out.println("Id de la orden: " + this.idOrden);
        System.out.println("Total de la orden $" + this.calcularTotal());
        System.out.println("Productos de la orden");
        
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
