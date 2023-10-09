import java.util.Scanner;

import static java.lang.Math.abs;

public class Es2 {
    public static void main(String[] args) {
        int km = -1, litre = -1, kmLitre = 0;

        Scanner scanner = new Scanner(System.in);
        while (km < 0) {
            System.out.println("insert km");
            try {
                km = abs(Integer.parseInt(scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.err.println("not a number");
            }
        }
        ;
        while (litre < 0 || kmLitre == 0) {
            System.out.println("insert litre");
            try {
                litre = abs(Integer.parseInt(scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.err.println("not a number");
            }
            try {
                kmLitre = km / litre;
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());

            }
        }

        System.out.println("km / litre = " + kmLitre);
    }
}