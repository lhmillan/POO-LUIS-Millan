public class Exemplo2 {
public static void main(String[] args) {
    String dia = "Domingo";

    String resultado = switch (dia){
        case "Segunda" -> "dia da semana";
        case "Terça" -> "dia de semana";
        case "Quarta" -> "dia de semana";
        case "Quinta" -> "dia de semana";
        case "Sexta" -> "dia de semana";
        case "Sábado" -> "dia de semana";
        case "Domingo" -> "dia de semana";
        default -> "Dia inválido";
    };
    System.out.println(resultado);

    String time = "Flamengo";
    String resposta = switch(time){
        case "Flamengo", "Va2co", "Botafofo", "NenC" -> "RJ MENOR";
        case "Santos", "Palmerda", "São Pau", "Cortinhas" -> "Saint Paulo";
        default -> "Outro estado";

    };
    System.out.println(resposta);

}
}
