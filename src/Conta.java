public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    protected int agencia;
    protected int numero;
    protected double saldo;
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void sacar(double valorSaque) {
        if (valorSaque < saldo){
            saldo -= valorSaque;
        } 
        else{
            System.out.println("Saldo Insuiciente");
        }
    }
    @Override
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }
    @Override
    public void transferir(double valorTransferencia, Conta contaTransferencia) {
        if(valorTransferencia < saldo){
            saldo -= valorTransferencia;
            contaTransferencia.setSaldo(contaTransferencia.getSaldo() + valorTransferencia);
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void imprimirExtrato(){
        System.out.println("Num.Agencia: " + agencia );
        System.out.println("Num.Conta: " + numero );
        System.out.println("Saldo: " + saldo );
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }


}
