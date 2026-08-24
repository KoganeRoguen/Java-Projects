java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o valor de A: _");
        double a = scanner.nextdouble();

        System.out.print("> Informe o valor de B: _");
        double b = scanner.nextdouble();

        double soma = a + b;

        System.out.printf("\n> SOMA = %.0f\n" + soma);

        scanner.close();
    }
}