package aula6.atividade2;

public class Pais {
    private String nome;

    public Pais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + "| País: " + this.nome;
    }

}
