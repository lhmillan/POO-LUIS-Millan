public class Operacao implements Livraria {
    private String tipo;
    private double valorOperacao;
    Livro livro;

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Valor: " + valorOperacao + ",  Livro: " + livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    @Override
    public void emprestarLivro() {
      valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
      // this.valorOperacao = (livro.getValor() * 0.02) + Livraria.taxaEmprestimo;
          }

    @Override
    public void venderLivro() {
         this.valorOperacao = livro.getValor() * 1.09;
         }

    
}
