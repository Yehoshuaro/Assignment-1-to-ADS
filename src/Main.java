import java.util.Scanner;

public class Main {
// I used recursion now
    public static int Pomodoro(int b, int n) {
        if (n < 0) {
            return 0;
        } else {
            return (int)(Math.pow(b, n) + Pomodoro(b, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = Pomodoro(b, n);

        System.out.print(b + "^0 + " + b + "^1 + ");
        for (int x = 2; x < n; x++) {
            System.out.print(b + "^" + x + " + ");
        }
        System.out.println(b + "^" + n + " = " + sum);
    }
}

