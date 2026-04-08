public class Propietario {
    private int id;
    private String nome;

    public Propietario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "id: " + id + ", nome: " + nome;
    }

}


