import java.util.Scanner;

public class maiornumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o primeiro número: _");
        int n1 = scanner.nextInt();

        System.out.print("> Informe o segundo número: _");
        int n2 = scanner.nextInt();

        System.out.print("> Informe o terceiro número: _");
        int n3 = scanner.nextInt();

        int maior = n1;

        if (n2 > n1) {
            maior = n2;
        }

        if (n3 > n2) {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}