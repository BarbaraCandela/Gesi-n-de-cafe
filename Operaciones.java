//Clase que gestiona el inventario.
public class Operaciones {
    private int inventario;

    public int getInventario(){
        return inventario;
    }
    public void setInventario(int inventario){
        this.inventario = inventario;
    }

    //Método que actualiza el inventario con una cantidad.
    public void actualizarInventario(int cantidad){
        this.inventario += cantidad;
    }

    //Método que llama a otro método de la clase producto.
    public void realizarPedido(Producto producto, int cantidad){
        //Reduce el stock de la clase producto con la cantidad que se pide.
        producto.setStock(producto.getStock() - cantidad);
        //Se actualiza el inventario restando la cantidad.
        this.inventario -= cantidad;
    }
}