package compañia;

import java.util.ArrayList;

public class LiderProyecto extends Programador{
    private ArrayList<Programador> programadores;
    
    public LiderProyecto(String lenguaje, String nombre, double salario, int id){
        super(lenguaje, nombre, salario, id);
        this.programadores = new ArrayList<>();
    }
    public void agregarProgramador(Programador p){
        this.programadores.add(p);
    }
    
    @Override
    public double calcularSalario() {
        double salarioTotal = 0;
        salarioTotal+=super.calcularSalario()*
                (super.calcularSalario()*
                this.programadores.size() * 0.1);
        return salarioTotal;
    }
    
    @Override
    public String listarInformacion() {
        String informacion=super.listarInformacion();
        informacion+="Programadores a cargo\n";
        for (Programador programador : programadores) {
            informacion+=programador.listarInformacion();
        }
        return informacion;
    }
}
