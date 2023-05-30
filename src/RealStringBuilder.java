public class RealStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%02d", 3));
        sb.append(String.format("/"));
        sb.append(String.format(Integer.toString(2023)));

        sb.append(String.format("%02d", 4));
        sb.append(String.format("/"));
        sb.append(String.format(Integer.toString(2023)));

        sb.append(String.format("%02d", 5));
        sb.append(String.format("/"));
        sb.append(String.format(Integer.toString(2023)));

        System.out.println(sb.toString());
    }
}
