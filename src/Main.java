import java.util.Scanner;

public class Main {

    public static int PositiveSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + PositiveSum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any n: ");
        int n = scanner.nextInt();

        int sum = PositiveSum(n);
        System.out.println(sum);
    }
}
