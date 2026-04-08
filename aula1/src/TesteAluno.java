public class TesteAluno {
    public static void main(String[] args) {
        //instanciar - criar um objeto em memória
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno1==aluno2);

        aluno1.nome = "Luisil";
        aluno1.matricula = 616;
        aluno1.idade = 24;
        aluno1.nota1=10;
        aluno1.nota1=8;
        System.out.println("Média do " + aluno1.nome + " é " + aluno1.calcularMedia());
        

        aluno2.nome = "Chose";
        aluno2.matricula = 999;
        aluno2.idade = 39;

        aluno3.nome = "Térektektugen da Silva";
        aluno3.matricula = 007;
        aluno3.idade = 49;

        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
        System.out.println(aluno3.idade);
    }
}
