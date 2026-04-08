package aula3.exercicio3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner s = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            opcao = s.nextInt();
            if (opcao >= 1 && opcao <= 4) {

                System.out.println("Digite o primeiro valor: ");
                double n1 = s.nextDouble();

                // double n2 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro
                // valor:"));
                // JOptionPane.showInputDialog("Primeiro valor:");

                // double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo
                // valor:"));
                // JOptionPane.showInputDialog("Segundo valor:");

                System.out.println("Digite o segundo valor:");
                double n2 = s.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.printf("Resultado: %.1f %n", Calculadora.soma(n1, n2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + Calculadora.subtracao(n1, n2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + Calculadora.multiplicacao(n1, n2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + Calculadora.divisao(n2, n2));
                        break;
                    default:

                        System.out.println("Valor inválido.");
                        break;
                }

            } else {
                System.out.println(Calculadora.sair());
            }

        }
    }

}