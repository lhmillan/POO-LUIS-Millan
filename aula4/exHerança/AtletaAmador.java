package aula4.exHerança;

public class AtletaAmador extends Maratona {
    boolean atestado;

    public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }
    @Override
    public String toString() {
        
        return super.toString() + (atestado?", possui atestado.":", não possui atestado.");
    }
    
}
