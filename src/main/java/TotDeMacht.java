import java.util.Scanner;

public class TotDeMacht {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is je basisgetal?");
        int getal = sc.nextInt();
        System.out.println("Wat is je exponent?");
        int exponent = sc.nextInt();
        System.out.println(printPower(getal, exponent));
    }

    private static int printPower(int getal, int exponent) {
        int y;
        if (exponent == 0) {
            return 1;
        }
        y = printPower(getal, exponent/2);
        y = y * y;
        if (exponent%2 == 0) {
            return y;
        }
        else {
            return getal *y;
        }
    }
}
