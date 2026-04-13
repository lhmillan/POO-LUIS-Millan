//Não posso instanciar interface
//guarda somente assinaturas de métodos
public interface Conta {
    public final int taxaSaque = 6;
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
}
