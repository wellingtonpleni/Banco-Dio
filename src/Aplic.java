import Dio.Cliente;
import Dio.Conta;
import Dio.ContaCorrente;
import Dio.ContaPoupanca;

import java.util.Scanner;

/**
 *
 * @author Wellington Barboza Rufino
 */
public class Aplic {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setNome("Wellington");

        Scanner entrada = new Scanner(System.in);

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        int opcao, opcaoCc, opcaoPoup;
        double valor;

        do{
            System.out.println("\n\n1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Sair");
            System.out.print("\n\tDigite sua opção: ");
            opcao = entrada.nextInt();

            switch (opcao){

                case 1 : do{

                    System.out.println("\n\n1 - Saque");
                    System.out.println("2 - Depósito");
                    System.out.println("3 - Extrato");
                    System.out.println("4 - Voltar");
                    System.out.print("\n\tDigite sua opção: ");
                    opcaoCc = entrada.nextInt();

                    switch (opcaoCc){
                        case 1 : System.out.print("Digite o valor: ");
                                valor = entrada.nextDouble();

                                if(corrente.getSaldo() >= valor){
                                    corrente.sacar(valor);
                                }else{
                                    System.out.println("Saldo insuficiente!");
                                }
                                break;

                        case 2 : System.out.print("Digite o valor: ");
                                valor = entrada.nextDouble();

                                corrente.depositar(valor);
                                break;

                        case 3 : corrente.imprimirExtrato();
                                break;
                    }

                }while (opcaoCc < 4);
                break;

                case 2 : do{

                    System.out.println("\n\n1 - Saque");
                    System.out.println("2 - Depósito");
                    System.out.println("3 - Extrato");
                    System.out.println("4 - Voltar");
                    System.out.print("\n\tDigite sua opção: ");
                    opcaoPoup = entrada.nextInt();

                    switch (opcaoPoup){
                        case 1 : System.out.print("Digite o valor: ");
                            valor = entrada.nextDouble();

                            if(poupanca.getSaldo() >= valor){
                                poupanca.sacar(valor);
                            }else{
                                System.out.println("Saldo insuficiente!");
                            }
                            break;

                        case 2 : System.out.print("Digite o valor: ");
                            valor = entrada.nextDouble();

                            poupanca.depositar(valor);
                            break;

                        case 3 : poupanca.imprimirExtrato();
                            break;
                    }

                }while (opcaoPoup < 4);
                break;

            }
        }while (opcao < 3);

    }
}
