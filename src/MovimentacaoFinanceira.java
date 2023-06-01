import java.util.Scanner;

public class MovimentacaoFinanceira {
    public static void main(String[] args) {

        String nomeCliente = "Ulisses Moraes Dos Reis Souza";
        String tipoConta = "Conta Corrente";
        double saldoAtual = 2500;
        int operacao = 0;

        System.out.println("****************************************************");
        System.out.println("Dados Iniciais do Cliente:");
        System.out.println("                          ");
        System.out.println("Nome:            " + nomeCliente);
        System.out.println("Tipo Conta:      " + tipoConta);
        System.out.println("Saldo Inicial:   R$ " + saldoAtual);
        System.out.println("****************************************************");



        while (operacao != 4) {

            System.out.println("Operações:");
            System.out.println("");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair");
            //
            Scanner leitura = new Scanner(System.in);

            operacao = leitura.nextInt();

            switch (operacao) {

                case 1:
                    consultaSaldo(saldoAtual);
                    break;

                case 2:
                    System.out.println("Informe Valor do Depósito: R$ " );
                    double valorDeposito = leitura.nextDouble();
                    if(valorDeposito < 0){
                        System.out.println("Valor Depósito Inválido!");
                        break;
                    } else {
                        depositarValor(valorDeposito, saldoAtual);
                        break;
                    }

                case 3:
                    System.out.println("Informe Valor da Transferência: R$ " );
                    double valorTransferencia = leitura.nextDouble();
                    if(valorTransferencia < 0){
                        System.out.println("Valor Transferência Inválido!");
                        break;
                    } else if (saldoAtual < valorTransferencia) {
                        System.out.println("Saldo Insuficiente!");
                        System.out.println("Transação Encerrada!");
                        break;
                    } else {
                        transferirValor(valorTransferencia, saldoAtual);
                        break;
                    }

                case 4:
                    System.out.println("Transação Encerrada!");
                    break;

                default:
                    System.out.println("Opção Inálida!");
                    break;
            }
        }

    }

    public static void consultaSaldo(double saldoAtual) {
        System.out.println("Saldo Atual: R$ " + saldoAtual);

    }
    private static void depositarValor(double valorDeposito, double saldoAtual) {
        saldoAtual = saldoAtual + valorDeposito;
        consultaSaldo(saldoAtual);
    }

    private static void transferirValor(double valorTransferencia, double saldoAtual) {
        saldoAtual = saldoAtual - valorTransferencia;
        consultaSaldo(saldoAtual);
    }
}
