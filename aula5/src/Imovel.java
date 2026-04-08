public class Imovel {
    private String tipo;
    private String endereco;
    private double valor;
    // RELACIONAMENTO ENTRE CLASSES:
    private Propietario propietario;//aqui em 'propietario' poderia ser qualquer nome

    public Imovel(String tipo, String endereco, double valor, Propietario propietario) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.valor = valor;
        this.propietario = propietario;
    }

    

    @Override
    public String toString() {
        return "tipo: " + tipo + ", endereco:" + endereco + ", valor:" + valor + ", propietario:" + propietario
                ;
    }



    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    

}
