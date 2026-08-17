import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("> Informe o valor: _");
    int numero = scanner.nextInt();

    if (numero % 2 == 0) {
        System.out.println("O valor " + numero + " é PAR");
    } else {
        System.out.println("O valor " + numero + " é IMPAR");
    }

    scanner.close();
    }
}