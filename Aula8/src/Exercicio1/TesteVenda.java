package Exercicio1;

import java.time.LocalDate;

public class TesteVenda {
    public static void main(String[] args) {
        Produto p1 = new Produto(0, "Shampoo", -1, Categoria.FARMACEUTICO);
        Produto p2 = new Produto(1, "Golden Oreo", 10, Categoria.ALIMENTO);
        Venda v1 = new Venda(p2, LocalDate.now(), 680);
        Venda v2 = new Venda(p1, LocalDate.of(2022, 12, 12),420);
        try {
            v1.calcularVenda();
            v1.mostrarVenda();
            v2.calcularVenda();
            v2.mostrarVenda();

            double totalVenda = 0;

            totalVenda += v1.getTotalVenda();
            totalVenda += v2.getTotalVenda();

            
        } catch (Exception e) {
            System.out.println("Erro: " +e.getMessage());
        }
    }
}
