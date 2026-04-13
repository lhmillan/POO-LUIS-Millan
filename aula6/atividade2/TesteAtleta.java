package aula6.atividade2;

public class TesteAtleta {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Brasil");
        Pais pais2 = new Pais("E.U.A");
    
        Atleta atleta1 = new Atleta("Anderson", 80, pais1);
        Atleta atleta2 = new Atleta("Charles", 59, pais2);
        Atleta atleta3 = new Atleta("Marcelo", 110, pais1);

        atleta1.verificaSituacao();
        atleta2.verificaSituacao();
        atleta3.verificaSituacao();
        System.out.println(atleta1);
        System.out.println(atleta2);
        System.out.println(atleta3+"\n");
        System.out.println("O total de atletas que participará da competição é: "+ Atleta.getTotalModalidade());
    }
}
