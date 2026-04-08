package aula3.exercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis", 5000);


        System.out.printf("Nome: %s %nSalário: R$%s %n",funcionario.getNome(),funcionario.getSalario());
        System.out.println("INSS: R$" + funcionario.calcularINSS());
        System.out.println("Vale Transporte: R$" + funcionario.calcularINSS());
        System.out.println("Salário Líquido: R$" + funcionario.salarioLiquido());
        
    }
}
