package aula4;

import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(123, "ana", "1245", 5000, "123456", "adm", 10);

        Diretor diretor = new Diretor(567, "Maria", "3434", 10000, "Produção");

        gerente.autenticacao("123");
        System.out.println(gerente.imprimirContraCheque());
        System.out.println(gerente.toString());
        gerente.reajusteSalario();
        System.out.println("Reajuste do salario do gerente: "+gerente.getSalario());
        
        diretor.reajusteSalario();
        System.out.println("Reajuste do salario do gerente: "+diretor.getSalario());
    
        JOptionPane.showMessageDialog(null, gerente, "teste", 1);
    }
}