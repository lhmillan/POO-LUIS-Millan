package aula4.exHerança2;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vendedor;
        Fixo v1 = new Fixo("Luis", "123456", 2100, 0.05);
        Fixo v2 = new Fixo("Carol", "654321", 2000, 0.05);
        char opc = ' ';
        double venda, somavenda = 0;

        do {
            System.out.println("------ Sistema de Vendas ------ ");
            System.out.println("Vendedores: \n1-" + v1.getNome() + "\n2-" + v2.getNome());
            vendedor = s.nextInt();

            System.out.println("Digite o valor da venda:");
            double valorVenda = s.nextDouble();

            switch (vendedor) {
                case 1:
                    v1.calcularSalario(valorVenda);
                    break;

                case 2:
                    v2.calcularSalario(valorVenda);
                    break;

                default:
                    System.out.println("Valor inválido.");
                    break;
            }
            System.out.println("Deseja sair? [S/N]");
            opc = s.next().charAt(0);
        } while (opc != 'S' && opc != 's');

        System.out.println("Nome: " + v1.getNome() + "\n Salario Bruto: R$ " + v1.getSalarioBruto());

    }
}
