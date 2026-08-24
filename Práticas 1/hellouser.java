import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("> Informe o seu nome _");
        String nome = scanner.nextLine();

        System.out.println("\nOlá, " + nome + "! Seja bem-vindo(a)!\n");

        scanner.close();
    }
}
