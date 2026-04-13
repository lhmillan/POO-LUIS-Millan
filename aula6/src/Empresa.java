public class Empresa implements Tributos{
    private String razaoSocial;
    private double rendimentos;
    
    public Empresa(String razaoSocial, double rendimentos) {
        this.razaoSocial = razaoSocial;
        this.rendimentos = rendimentos;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    @Override
    public String toString() {
        return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
    }

    @Override
    public double calcularImpostoRenda() {
        return rendimentos * impostoRendaPJ;      
        
    }

    @Override
    public double calcularICMS() {
        return rendimentos * icms;
         }
    
    



    
}
