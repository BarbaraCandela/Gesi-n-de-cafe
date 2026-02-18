//La clase gerente hereda de la clase empleado.
public class Gerente extends Empleado {
    //Añadimos atributos específicos para la clase.
    private String departamento;
    private double bono;

    //Constructor que inicia los atributos.
    public Gerente(String nombre, int id, double salario, String departamento, double bono) {
        super(nombre, id, salario); //Llama al constructor de la clase empleado.
        this.departamento = departamento; 
        this.bono = bono;
    }
    //Usamos get y set para obtener los atributos.
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getBono() {
        return bono;
    }
    public void setBono(double bono) {
        this.bono = bono;
    }
    //Método  que suma el salario base con el bono.
    public double calcularSalario(){
    //Llama al método de la clase empleado y le suma el bono, usamos polimorfismo.
        return super.calcularSalario() + bono;
    }
}
