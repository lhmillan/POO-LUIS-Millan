package Exercicio1;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
    Produto produto;
    LocalDate dataCompra;
    int quantidade;
    double totalVenda;

    public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
        this.produto = produto;
        this.dataCompra = dataCompra;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return " Produto:" + produto + ", dataCompra: " + dataCompra + ", quantidade: " + quantidade
                + ", totalVenda: " + totalVenda + "]";
    }

    public Produto getProduto() {
        return produto;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void calcularVenda() {
        if (quantidade < 1) {
            throw new VendaException("Quantidade inválida.");
        }
        if (produto.getValor() < 0) {
            throw new VendaException("Valor inválido.");
        }
        totalVenda += produto.getValor() * quantidade;
    }

    public void mostrarVenda() {
        System.out.println(produto.getDescricao() + " - " + totalVenda);
    }

}
