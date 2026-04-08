import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        char resposta;

        do{

            // inferência
            //var conta2 = new Conta();
            //var texto = "Aula";
            conta.saldo = 1000;
            
            System.out.println("Digite o nº da conta:");
            //conta.numero = 123;
            int numero = sc.nextInt();

            System.out.println("Digite o seu nome:");
            //conta.titular = "Maria";
            String nome = sc.next();
            
            System.out.println("Digite o valor do depósito:");
            double valor = sc.nextDouble();
            conta.depositar(valor);

            System.out.println("Digite o valor do saque:");
            valor = sc.nextDouble();

            if (conta.saque(valor)) {
                System.out.println("Saque efetuado");
            } else {
            System.out.println("Saque não efetuado");
            }
            System.out.println("Saldo atual:" + conta.saldo);
            
            System.out.println("Deseja continuar? [Sim/Não]");
            resposta = sc.next().charAt(0);

    } while(resposta != 'N' || resposta !='n');
        
}
}