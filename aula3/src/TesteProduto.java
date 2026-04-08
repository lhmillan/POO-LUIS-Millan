import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        // inserir o scanner
        // Produto produto = new Produto(1,"Celular",2000);
        // new Produto();

        // Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        // System.out.println("O produto vendido foi: "+produto.getNome());
        // nova forma de entrada de dados usando o construtor

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o valor do produto: ");
        double preco = scanner.nextDouble();

        Produto p1 = new Produto(codigo, nome, preco);

        System.out.println("O código do produto é " + p1.getCodigo());
        System.out.println("O nome do produto é " + p1.getNome());
        System.out.println("O valor do produto é " + p1.getPreco());

    }
}
