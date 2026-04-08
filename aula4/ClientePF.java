package aula4;

public class ClientePF extends Cliente{
String cpf,rg;

public ClientePF(String nome, String email, int codigo, String cpf, String rg) {
    super(nome, email, codigo);
    this.cpf = cpf;
    this.rg = rg;
}

public String getCpf() {
    return cpf;
}

public String getRg() {
    return rg;
}

}
