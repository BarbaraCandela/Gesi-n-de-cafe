
 public class Empleado{ //creamos la clase empleado y sus atributos.
    private String nombre;
    private int id;
    private double salario;

    //Asignamos los atributos con el constructor.
    public Empleado(String nombre, int id,double salario){
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
     //Usamos el método get para obtener el atributo.
    public String getNombre() {
        return nombre;
    }
    //Usamos el método set para establecer el atributo.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    //Creamos la funcion para calcular el salario.
    public double calcularSalario(){
        return salario;
    }
}