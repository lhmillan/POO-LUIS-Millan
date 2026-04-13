package Exercicio1;

import java.time.LocalDate;

public abstract class Animal {
    private String nome;
    private LocalDate dataVacinacao;

    public Animal(String nome, LocalDate dataVacinacao) {
        this.nome = nome;
        this.dataVacinacao = dataVacinacao;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataVacinacao() {
        return dataVacinacao;
    }

    public abstract String emitirSom();

    
}
