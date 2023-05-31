import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {

    public static void main(String[] args) {

        int numeroSecreto = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);
        //

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Informe o Número Secreto de 1 a 100:");
            int numeroEntrada = Integer.parseInt(leitura.nextLine());
            int tentativas = 0;

            if (numeroSecreto == numeroEntrada) {
                System.out.println("Parabéns! Você Venceu!! Descobriu o Número Secreto");
                break;
            } else if (numeroSecreto > numeroEntrada) {
                tentativas = 4 - i;
                System.out.println("Você Ainda não Acertou! Numero Secreto é Maior que Número Informado!! Você Ainda Possui " + tentativas + " Tentativas!! Boa Sorte!!!");
            } else {
                tentativas = 4 - i;
                System.out.println("Você Ainda não Acertou! Numero Secreto é Menor que Número Informado!! Você Ainda Possui " + tentativas + " Tentativas!! Boa Sorte!!!");
            }

        }

        System.out.println("Número Secreto: " + numeroSecreto);

    }
}
