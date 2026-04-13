package Exercicio2;

public class Propietario {
    String nome;

    public Propietario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return super.toString() + nome;
    }


    
}
