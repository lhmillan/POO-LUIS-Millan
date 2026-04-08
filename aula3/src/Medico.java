public class Medico {
    private int crm;
    private String nome;
    private double valorConsulta;
    private static int totalMed=0; //não pertence ao objeto porque é estático
    

//contrutor com parâmetros
    public Medico(int crm, String nome, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorConsulta = valorConsulta;
        totalMed++;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public static int getTotalMed() {
        return totalMed;
    }


}
