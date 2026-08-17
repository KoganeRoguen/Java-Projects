import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PI = 3.14159;

        System.out.print("> Informe o raio do círculo: _");
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.5f\n", area);

        scanner.close();
    }
}
