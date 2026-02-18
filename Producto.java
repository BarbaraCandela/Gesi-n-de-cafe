public class Producto { //creamos la clase Producto.
    //Creamos los atributos privados de la clase.
    private String nombre;
    private double precio;
    private int stock;

    //Asignamos los atributos con el constructor.
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    //Usamos el método get para obtener el atributo.
    public String getNombre() {
        return nombre;
    }
    //Usamos el método set para establecer el atributo.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Igual para el atributo precio.
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Igual para el atributo stock.
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //Creamos el método que nos devuelve un String con los atributos del producto.
    public String describirProducto(){
        return nombre + precio + stock;
    }
    //Creamos el método para añadir el stock actual.
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }
}
