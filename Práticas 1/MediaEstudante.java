import java.util.Scanner;

public class MediaEstudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe a primeira nota: _");
        double nota1 = scanner.nextDouble();

        System.out.print("> Informe a segunda nota: _");
        double nota2 = scanner.nextDouble();

        System.out.print("> Informe a terceira nota: _");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("\nA média aritimética é: %.2f\n\n", media);

        scanner.close();
    }
}
