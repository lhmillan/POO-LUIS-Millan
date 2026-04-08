public class Aluno {
    //estes são os atributos da classe
    int matricula, idade;
    String nome, telefone;
    double nota1,nota2;
    //comportamentos/método

    //método(a.k.a função) sem retorno
    public void imprimir(){
        System.out.println("Bem vindo a escola!");
    }

    //método(ou função) com retorno
    //DOUBLE pois ela retorna double
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }


}
