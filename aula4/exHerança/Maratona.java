package aula4.exHerança;

public class Maratona {
    protected String nome,sexo;
    protected int idade;
    protected double altura;
    
    public Maratona(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

    public void verificaSituacao() {
        if (idade > 18 || altura >= 1.80) {
            System.out.printf("O/A atleta "+ getNome()+" participará.\n");
        }else{
            System.out.printf("O/A atleta "+  getNome() +" não participará.\n");
        }
        
    }

    public String toString() {
        return "Nome: "+nome;
    }
    
}
