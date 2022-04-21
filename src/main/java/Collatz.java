import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welk getal wil je omzetten?");
        int getal = sc.nextInt();
        System.out.println(collatz(getal));
    }

    private static int collatz(int getal) {
        if (getal == 1) {
            return 0;
        } else if (getal % 2 == 0) {
            return 1+ collatz(getal / 2);
        } else {
            return 1+ collatz(3 * getal + 1);
        }
    }
}
