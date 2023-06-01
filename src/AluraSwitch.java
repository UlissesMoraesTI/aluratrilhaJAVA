public class AluraSwitch {
    public static void main(String[] args) {

        switch (3) {

            case 1:
                System.out.println("Valor igual 1");
                break;

            case 2:
                System.out.println("Valor igual 2");
                break;

            case 3:
                System.out.println("Valor igual 3");
                break;

            default:
                System.out.println("Valor Inválido");
                break;
        }

        int dia = 3;

        String nomeDia;

        switch (dia) {

            case 1:
                nomeDia = "Domingo";
                break;

            case 2:
                nomeDia = "Segunda-feira";
                break;

            case 3:
                nomeDia = "Terça-feira";
                break;

            case 4:
                nomeDia = "Quarta-feira";
                break;

            case 5:
                nomeDia = "Quinta-feira";
                break;

            case 6:
                nomeDia = "Sexta-feira";
                break;

            case 7:
                nomeDia = "Sábado";
                break;

            default:
                nomeDia = "Inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
