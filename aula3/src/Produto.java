//variavéis de objeto, pertencem 
public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    //OVERLOAD (SOBRECARGA) - quando temos mais de um construtor ou metodo com mesmo nome e parâmetros
    
    // construtor default = ele é implicito e não tem parâmetro

    public Produto() {
        System.out.println("Construtor executado!");
    }

    // construtor cheio - possui todos os atributos como parâmetro
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        System.out.println("Construtor cheio executado!");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
