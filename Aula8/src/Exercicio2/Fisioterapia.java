package Exercicio2;

public class Fisioterapia extends Faculdade implements Eventos {

    public Fisioterapia(String nome, String nomeFaculdade, int bloco) {
        super(nome, nomeFaculdade, bloco);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String matrizCurricular() {
        // TODO Auto-generated method stub
        return super.matrizCurricular();
    }

    @Override
    public void fazerMatricula() {
        // TODO Auto-generated method stub
        super.fazerMatricula();
    }

    @Override
    public String programacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'programacao'");
    }

    @Override
    public void conteudoEventos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conteudoEventos'");
    }

}
