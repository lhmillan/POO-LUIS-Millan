package aula4.exHerança;

public class TesteMaratona {
    public static void main(String[] args) {
        AtletaAmador atleta1 = new AtletaAmador("Tião", "Masculino", 25, 1.89, false);
        AtletaProfissional atleta2 = new AtletaProfissional("Marquin", "Masculino", 17, 1.79, 80);
        AtletaAmador atleta3 = new AtletaAmador("Vanessa", "Feminino", 21, 1.70, false);

        System.out.println(atleta1.toString());
        atleta1.verificaSituacao();
        System.out.println(atleta2.toString());
        atleta2.verificaSituacao();
        System.out.println(atleta3.toString());
        atleta3.verificaSituacao();
    }
}
