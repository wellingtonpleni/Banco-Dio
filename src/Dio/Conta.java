package Dio;
/**
 *
 * @author Wellington Barboza Rufino
 */
public abstract class Conta implements IConta{

    protected static final int agenciaPadrao = 1;
    private static int SEQUENCIAL = 1000;

    protected int agencia;
    protected  int conta;
    protected  double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.agenciaPadrao;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInformacoes() {
    System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.conta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
