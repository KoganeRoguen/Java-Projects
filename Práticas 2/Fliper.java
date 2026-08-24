import java.util.Scanner;

public class Fliper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int R = scanner.nextInt();

        if (P == 0) {
            System.out.println("\nC");
        } else if (R == 0) {
            System.out.println("\nB");
        } else {
            System.out.println("\nA");
        }

        scanner.close();
    }
}