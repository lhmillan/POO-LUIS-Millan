public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123,"Maria",2000);

        try {
        contaCorrente.depositod(0);
        System.out.println("Saldo atual é:"+contaCorrente.getSaldo());
    } catch (ContaException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }finally{
        System.out.println("Saldo atual é:"+contaCorrente.getSaldo());
    }
}
}