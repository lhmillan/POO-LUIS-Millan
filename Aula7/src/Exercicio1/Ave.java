package Exercicio1;

import java.time.LocalDate;

public class Ave extends Animal{
    String cor;

    public Ave(String nome, LocalDate dataVacinacao, String cor) {
        super(nome, dataVacinacao);
        this.cor = cor;
    }

    public String voar(){
        return "Voo";
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }
}
