import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Van welk getal wil je de faculteit berekenen?");
        int getal = sc.nextInt();
        System.out.println(faculteit(getal));
    }

    private static int faculteit(int getal) {
        if (getal == 1) {
           return 1;
        }
        return getal * faculteit(getal -1);
    }
}
