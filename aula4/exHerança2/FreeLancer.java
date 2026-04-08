package aula4.exHerança2;

public class FreeLancer extends Vendedor {
    protected int diasTrabalhados;
    protected double valorDia;

    public FreeLancer(String nome, String cpf, int diasTrabalhados, double valorDia) {
        super(nome, cpf);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public double getValorDia() {
        return valorDia;
    }
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    

    
}
