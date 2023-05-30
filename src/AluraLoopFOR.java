import java.util.Scanner;

public class AluraLoopFOR {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int i = 0;

        for (i = 0; i < 3; i++) {
            System.out.println("Informe avaliação:");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média = " + mediaAvaliacao/i);
    }
}
