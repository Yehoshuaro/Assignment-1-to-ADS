import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Reverse(scanner, n);
    }

    public static void Reverse(Scanner scanner, int n) {
        if (n == 0) {
            return;
        }

        int current = scanner.nextInt();
        Reverse(scanner, n - 1);
        System.out.print(current + " ");
    }
}

