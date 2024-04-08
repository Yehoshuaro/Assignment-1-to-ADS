import java.util.Scanner;

public class Main {
    // Just trying to understand the syntax logic of the task

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int a = 0; a <= n; a++) {
            sum += Math.pow(b, a);
        }

        System.out.print(b + "^0 + " + b + "^1 + ");
        for (int x = 2; x < n; x++) {
            System.out.print(b + "^" + x + " + ");
        }
        System.out.println(b + "^" + n + " = " + sum);
    }
}
