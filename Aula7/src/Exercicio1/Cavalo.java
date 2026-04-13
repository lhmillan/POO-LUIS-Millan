package Exercicio1;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
    String marcaFerradura;

    

    public Cavalo(String nome, LocalDate dataVacinacao, String marcaFerradura) {
        super(nome, dataVacinacao);
        this.marcaFerradura = marcaFerradura;
    }



    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }

   public void amamentar() {
        
    }



   @Override
   public void trocarFerradura() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'trocarFerradura'");
   }



   @Override
   public void viajar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'viajar'");
   }
    }

