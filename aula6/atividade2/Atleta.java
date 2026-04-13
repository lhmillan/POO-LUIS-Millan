package aula6.atividade2;

public class Atleta implements Olimpiadas {
private String nome;
private double peso;
private String modalidade;
private Pais pais;
private static int totalModalidade;

public Atleta(String nome, double peso, Pais pais) {
    this.nome = nome;
    this.peso = peso;
    this.pais = pais;
}

public String getNome() {
    return nome;
}

public double getPeso() {
    return peso;
}

public String getModalidade() {
    return modalidade;
}

public Pais getPais() {
    return pais;
}

public static int getTotalModalidade() {
    return totalModalidade;
}

public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
}

@Override
public String verificaSituacao() {
    if (peso>90) {
         setModalidade("Peso pesado"); 
         totalModalidade++;
         return "Participará";
        
    } else if (peso>60) {
        setModalidade("Peso médio");
        totalModalidade++;
        return "O atleta participará";
    }else{
        setModalidade("-------");
        return "O atleta não participará";
    }
   }

@Override
public String toString() {
    return "Nome: " + nome + " | Peso: " + peso + " | Modalidade: " + modalidade;
}


}
