import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel getallen wil je afprinten?");
        int aantal = sc.nextInt();

        for (int i = 1; i <= aantal; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
