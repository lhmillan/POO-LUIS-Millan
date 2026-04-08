package aula4.exHerança2;

public class Fixo extends Vendedor {
    protected double salarioBase, comissao, salarioBruto;

    public Fixo(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    
    public String toString() {
        return super.toString();
    }
    
     public void calcularSalario(double valorVenda){
       System.out.println("O salário com comissão é:"+ (salarioBruto += valorVenda));
    }
}
