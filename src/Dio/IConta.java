package Dio;
/**
 *
 * @author Wellington Barboza Rufino
 */
public interface IConta {
    void sacar (double valor);

    void depositar(double valor);

    void transferir(Conta conta, double valor);

    void imprimirExtrato();
}
