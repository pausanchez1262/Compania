package compañia;

public class Consultor extends Trabajador {
    private String labor;
    
    public Consultor(String labor, int id){
        super(id);
        this.labor = labor;
    }

    @Override
    public double calcularSalario() {
        return 220;
    }

    @Override
    public String listarInformacion() {
        return "Consultor" + this.id + " " + this.labor;
    }
    
}
