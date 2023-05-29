public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        if (anoDeLancamento >= 2022){
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Filme Retrô");
        }

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de Aventura";

        System.out.println(sinopse);

    }
}