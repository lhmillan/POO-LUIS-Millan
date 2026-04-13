package ExercícioFixaçãoRoni;

public class Cidade { 
    /*Cidade não herda de Estado pelo mesmo 
    motivo de Jogador não herdar de time.*/

    private String nomecidade;
    private Estado estado;

    public Cidade(String nomecidade, Estado estado) {
        this.nomecidade = nomecidade;
        this.estado = estado;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public Estado getEstado() {
        return estado;
    }

}
