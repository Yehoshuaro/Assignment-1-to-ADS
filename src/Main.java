import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int x = 0; x < n; x++) {
            StringReverse(scanner.nextLine());
        }
    }

    private static void StringReverse(String str) {
        //Не прям понял, как здесь можно сделать значение с Null, чтобы все работало, но вроде сойдет и так
        if (str.isEmpty()) {
            return;
        }

        //here I also don't understand at all, how to do it right
        char RevEntStr = str.charAt(str.length() - 1);
        System.out.print(RevEntStr);

        StringReverse(str.substring(0, str.length() - 1));
    }
}
