package Ex1revisao;

public class CartaoCredito extends Cartao {
    private double limite;


    public CartaoCredito(String numero, String dataValidade, double limite) {
        super(numero, dataValidade);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

   
}
