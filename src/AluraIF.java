public class AluraIF {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus ";
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

        if (incluidoNoPlano == true || tipoPlano.trim().equals("plus")) {
            System.out.println("Filme Liberado!");
        }  else {
            System.out.println("Deve pagar a Locação");
        }
    }
}
