import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int a = 0; a < size; a++) {
            System.out.print("Enter " + (a + 1) + " element: ");
            arr[a] = scanner.nextInt();
        }

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int x = 0; x < n; x++) {
            sum += arr[x];
        }

        System.out.println(sum);
    }
}
