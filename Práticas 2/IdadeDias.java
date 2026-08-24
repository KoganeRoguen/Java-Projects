import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o valor em dias: _");
        int vdias = scanner.nextInt();

        int anos = vdias / 365;
        int resto = vdias % 365;

        int meses = resto / 30; 
        int dias = resto % 30;

        System.out.println("\n" + anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        scanner.close();

    }
}