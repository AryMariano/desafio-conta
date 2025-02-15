public interface IConta {

    void sacar(double valorSaque);

    void depositar(double valorDeposito);

    void transferir(double valorTransferencia, Conta contaTransferencia);

    void imprimirExtrato();

}
