public class Clinica extends PlanoSaude {
    private String cnpj;
    private String nome;

   

    public Clinica(String empresa, String cnpj, String nome) {
        super(empresa);
        this.cnpj = cnpj;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: "+ cnpj + ", Nome: " + nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
