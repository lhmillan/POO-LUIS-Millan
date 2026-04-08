package aula3.exercicio1;


public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularINSS(){
        return salario*0.11;
    }

    public double calcularValeTransporte(){
        return salario*0.06;
    }

    public double salarioLiquido(){
        return salario-calcularINSS()-calcularValeTransporte();
    }
    

}
