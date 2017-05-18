package compañia;

public class Administrador extends Empleado {
    
    public Administrador(String nombre, double salario, int id){
        super(nombre, 100, id);
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String listarInformacion() {
        return "Administrador" + this.id + " " + this.nombre;
    }
    
}
