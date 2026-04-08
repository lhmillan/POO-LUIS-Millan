package aula4;

public class ClientePJ extends Cliente{
String cnpj, razãoSocial, inscricaoEstadual;

public String getCnpj() {
    return cnpj;
}

public String getRazãoSocial() {
    return razãoSocial;
}

public String getInscricaoEstadual() {
    return inscricaoEstadual;
}

public ClientePJ(String nome, String email, int codigo, String cnpj, String razãoSocial, String inscricaoEstadual) {
    super(nome, email, codigo);
    this.cnpj = cnpj;
    this.razãoSocial = razãoSocial;
    this.inscricaoEstadual = inscricaoEstadual;
}

}
