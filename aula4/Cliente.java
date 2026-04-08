package aula4;

public class Cliente {
    protected String nome, email;
    protected int codigo;

    public Cliente(String nome, String email, int codigo) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
    }

    public Cliente(){

        
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCodigo() {
        return codigo;
    }


    public String toString() {
         return "nome: "+nome+"codigo: "+codigo;
    }
}
