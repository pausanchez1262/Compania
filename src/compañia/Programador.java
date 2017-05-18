package compañia;

public class Programador extends Empleado{
    protected String lenguaje;
    
    public Programador(String lenguaje, String nombre, double salario, int id){
        super(nombre, 100, id);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = this.salario;
        if(this.lenguaje.equals("java"))
            salarioTotal+=(this.salario*0.2);
        return salarioTotal;
    }

    @Override
    public String listarInformacion() {
        return "Programador" + this.id + " " + this.nombre;
    }
    
}
