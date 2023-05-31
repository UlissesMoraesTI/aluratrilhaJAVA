import java.util.Scanner;

public class AluraLoopWhile {

    public static void main(String[] args) {

                Scanner leitura = new Scanner(System.in);
                //
                double mediaAvaliacao = 0;
                double nota = 0;
                int totalDeNotas = 0;
                //

                while(nota != -1) {
                    //
                    System.out.println("Informe avaliação: ou -1 para <Encerrar Transação>");
                    //
                    nota = leitura.nextDouble();

                    if (nota != -1) {
                        mediaAvaliacao += nota;
                        totalDeNotas++;
                    }
                }

                System.out.println("Média = " + mediaAvaliacao/totalDeNotas);

                int contador = 1;

                while (contador <= 10) {
                    System.out.println(contador);
                }
    }
}
