import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> Informe o primeiro valor: _");
        double x = scanner.nextDouble();

        System.out.print("> Informe o segundo valor: _");
        double y = scanner.nextDouble();

        double soma = x + y;
        
        System.out.printf("\n> A soma dos valores " + x + " e " + y + " é: " + soma + "\n\n");
        
        scanner.close();
    }
}
