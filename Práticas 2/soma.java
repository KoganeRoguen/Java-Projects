import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o valor de A: _");
        double a = scanner.nextDouble();

        System.out.print("> Informe o valor de B: _");
        double b = scanner.nextDouble();

        double x = a + b;
        
        System.out.printf("\n X = %.0f \n\n", x);
        
        scanner.close();
    }
}
