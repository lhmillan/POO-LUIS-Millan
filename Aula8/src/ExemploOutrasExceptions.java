import javax.print.DocFlavor.STRING;

public class ExemploOutrasExceptions {
    public static void main(String[] args) {
        int vetor[] = {10,20,30};
        String fraseEntrada = "JAVA CLASS";
        String fraseSaida = null;
        Integer b = 21 ;
        Integer c = 10;
        try {
            fraseSaida = fraseEntrada.toUpperCase();
            System.out.println(b+c);
            System.err.println(fraseSaida);
            System.out.println(vetor[1]);
            System.out.println(vetor[4]);
        } catch (Exception e) {
            System.out.println("Erro! Nulo");
            e.printStackTrace();
        }


    }
}
