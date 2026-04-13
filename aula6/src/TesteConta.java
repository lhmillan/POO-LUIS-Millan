public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Dante", 1000);
        System.out.println("CONTRATO CONCLUIDO!");
        cc.deposito(500);
        System.err.println("SAQUE PARA COMER PIZZA!");
        cc.saque(200);
        System.out.println("Seu saldo é: "+ cc.getSaldo());
    }
}
