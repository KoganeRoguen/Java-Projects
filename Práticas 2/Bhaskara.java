import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o valor de A: _");
        double a = scanner.nextDouble();
        
        System.out.print("> Informe o valor de B: _");
        double b = scanner.nextDouble();
        
        System.out.print("> Informe o valor de C: _");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (a == 0 || delta < 0) {
            System.out.println("\n- Impossível calcular -\n");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("\nR1 = %.5f\n", r1);
            System.out.printf("\nR2 = %.5f\n", r2);
        }
        
        scanner.close();
    }
}