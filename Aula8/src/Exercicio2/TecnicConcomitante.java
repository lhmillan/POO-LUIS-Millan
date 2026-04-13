package Exercicio2;

public class TecnicConcomitante extends ColegioAplicacao{
    public String nomeCurso;

    public TecnicConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
        super(nome, nomeCoordenador);
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    @Override
    public void fazerMatricula() {
        // TODO Auto-generated method stub
        super.fazerMatricula();
    }

        public void reuniaoDePais(){

        }
    }

