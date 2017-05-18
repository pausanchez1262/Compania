package compañia;

public abstract class Empleado extends Trabajador{
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario, int id){
        super(id);
        this.nombre = nombre;
        this.salario = salario;
        
    }
}
