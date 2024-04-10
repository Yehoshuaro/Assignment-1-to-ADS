import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        System.out.println("Enter k:");
        int k = scanner.nextInt();
        Road(new int[n], 0, n, k);
    }

    public static void Road(int[] sequence, int index, int n, int k) {
        if (index == n) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= k; i++) {
            sequence[index] = i;
            Road(sequence, index + 1, n, k);
        }
    }
}
