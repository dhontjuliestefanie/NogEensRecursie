import java.util.Scanner;

public class DecimaalNaarBinair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welk getal wil je omzetten naar een binair getal?");
        int getal = sc.nextInt();
        zetOmNaarBinair(getal);
    }

    private static void zetOmNaarBinair(int getal) {
        if (getal > 0) {
            zetOmNaarBinair(getal/2);
            System.out.print(getal%2);
        }
    }
}
