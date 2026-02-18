//La clase CafeEspecial hereda de la clase Producto
public class CafeEspecial extends Producto {
    //Añadimos atributos específicos para la clase.
    private String origen;
    private double notaDeCata;

    //Creamos el constructor que inicia los atributos.
    public CafeEspecial(String nombre,double precio,int stock, String origen, double notaDeCata){
        super(nombre, precio, stock);//Llama al constructor de la clase producto.
        this.origen = origen;
        this.notaDeCata = notaDeCata;
    }

    //Usamos get y set para obtener los atributos.
    public String getOrigen(){
        return origen;
    }
    public void setOrigen(String origen){
        this.origen = origen;
    }
    public Double getNotaDeCata(){
        return notaDeCata;
    }
    public void setNotaDeCata(double notaDeCata){
        this.notaDeCata = notaDeCata;
    }

    //Creamos el método para describir el producto y añadimos los atributos específicos.
    public String describirProducto(){
    //Llama al método de la clase producto, usamos polimorfismo.
        return super.describirProducto() + origen + notaDeCata;
    }

 }

    

