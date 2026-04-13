package ExercícioFixaçãoRoni;

public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private Cidade cidade;

    public Endereco(String bairro, String cep, Cidade cidade) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

}
