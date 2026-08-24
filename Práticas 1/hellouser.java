import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(">_ ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo(a)!");

        scanner.close();
    }
}