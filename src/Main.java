import java.util.Scanner;

public class Main {
    public static int Sum_Function(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * n + Sum_Function(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int sum = Sum_Function(n);

        String output = "";
        for (int i = 1; i <= n; i++) {
            output += i + "^2";
            if (i < n) {
                output += " + ";
            }
        }
        output += " = " + sum;


        System.out.println(output);
    }
}

