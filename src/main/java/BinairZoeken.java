import java.util.Scanner;

public class BinairZoeken {
    public static void main(String[] args) {
        int[] getallen = new int[] {1,3,5,7,9,11,13,15,17,19,21,23,25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Welk getal zoek je?");
        int target = sc.nextInt();
        if (binairZoeken(target, getallen)) {
            System.out.println("Hoera, gevonden!");
        }
        else {
            System.out.println("Nope, niets gevonden!");
        }
    }

    private static boolean binairZoeken(int target, int[] getallen) {
        return binairZoeken(0, getallen.length -1, target, getallen);
    }

    private static boolean binairZoeken(int start, int end, int target, int[] getallen) {
        if (start > end) {
            return false;
        }
        int midden = (start + end) / 2;
        if (getallen[midden] == target) {
            return true;
        }
        else if (getallen[midden] > target) {
            return binairZoeken(start, midden -1, target, getallen);
        }
        else {
            return binairZoeken(midden+1, end, target, getallen);
        }
    }
}
