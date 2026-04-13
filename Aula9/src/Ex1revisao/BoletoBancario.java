package Ex1revisao;
public class BoletoBancario implements Pagavel{
    private String codigoBarras;


    
    public BoletoBancario(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }



    @Override
    public double pagar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }
}
