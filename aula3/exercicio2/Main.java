package aula3.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char r = 'N';
        do {
            Scanner s = new Scanner(System.in);

            System.out.println("Insira o nome do produto: ");
            String descricao = s.nextLine();

            System.out.println("Insira o valor do produto: ");
            double valor = s.nextDouble();

            System.out.println("Insira a quantidade do produto: ");
            int quantidade = s.nextInt();

            Produto produto = new Produto(descricao, valor, quantidade);

            System.out.printf("Produto:%n%s%n",produto.getDescricao());
            System.out.printf("Valor:%n%f%n",produto.getValor());
            System.err.printf("Quantidade:%n%d%n",produto.getQuantidade());
            System.out.printf("Descrição:%n%s%n",produto.getDescricao());
            System.err.printf("Valor:%f%nTotal:%f%n",produto.getValor(),produto.getValor()*quantidade,produto.calcularICMS());

            System.out.println("Deseja encerrar o programa? (S/N)");
            r = s.next().charAt(0);

        } while (r == 'S');

    }
}
