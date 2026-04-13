package Exercicio2;

public class Direito extends Faculdade implements Eventos, Oab {

    private int tempoDuracao;

 

    public Direito(String nome2, String nomeFaculdade, int bloco, int tempoDuracao) {
        super(nome2, nomeFaculdade, bloco);
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
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
    public boolean realizarProvas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarProvas'");
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

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

}
