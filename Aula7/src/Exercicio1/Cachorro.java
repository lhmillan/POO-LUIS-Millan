package Exercicio1;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {

    public Cachorro(String nome, LocalDate dataVacinacao) {
        super(nome, dataVacinacao);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }
  public void amamentar() {
        
    }

  @Override
  public boolean levarVeterinario() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'levarVeterinario'");
  }

  @Override
  public boolean alimentar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
  }


}
