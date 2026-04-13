package ExercícioFixaçãoRoni;

public class Main {
    public static void main(String[] args) {
        
        
        Estado state = new Estado("Rio de Janeiro", "RJ");
        Cidade ciudad = new Cidade("Petrópolis", state);
        Endereco endereco = new Endereco("Rua Bingen 511", "Bingen", ciudad);
        Contato contato = new Contato("Luis", endereco);
        Telefone[] telefone = {new Telefone("2499772288"),new Telefone("249880808")};
        contato.setTelefones(telefone);

        System.out.println("Nome:"+contato.getNome());
        System.out.println(endereco.getBairro() +" "  + endereco.getCidade() + state.getNomeEstado());
        
        
       
        
    }
}
