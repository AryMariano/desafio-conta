

public class Main {
    public static void main(String[] args) throws Exception {

        
        
        Conta contaCorrente = new ContaCorrente();

        Conta contaPoupanca = new ContaPoupanca();


        contaCorrente.depositar(600);

        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(350, contaPoupanca);

        contaCorrente.imprimirExtrato();

        contaPoupanca.imprimirExtrato();

        contaPoupanca.sacar(400);








    }
}
