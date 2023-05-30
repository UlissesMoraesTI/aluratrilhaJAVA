import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        //
        System.out.println("Informe o Filme:");
        String filme = leitura.nextLine();
        //
        System.out.println("Informe Ano Lançamento:");
        String anoDeLancamento = leitura.nextLine();
        //
        System.out.println("Informe Avaliação:");
        String avaliação = leitura.nextLine();
        //
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliação);
    }
}
