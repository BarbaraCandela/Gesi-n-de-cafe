//Clase que gestiona los ingresos y los gastos.
public class Finanzas {
    //Creamos los atributos privados de la clase.
    private double ingresos;
    private double gastos;

    //Usamos los métodos get y set para obtener los ingresos y los gastos.
    public double getIngresos(){
        return ingresos;
    }
    public void setIngresos(double ingresos){
        this.ingresos = ingresos;
    }
    public double getGastos(){
        return gastos;
    }
    public void setGastos(double gastos){
        this.gastos = gastos;
    }

    //Creamos el método para calcular el beneficio con los atributos. 
    public double calcularBeneficio(){
        return ingresos - gastos;
    }
}
