import java.util.Random;
import java.util.Scanner;

public class Es1 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Random random = new Random();
        String selection;
        int pos;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
            System.out.println(arr[i]);
        }

        do {
            System.out.println("select array position 1 - 5");
            selection = scanner.nextLine();
            try {
                pos = Integer.parseInt(selection) - 1;
                if (pos >= 0)
                    System.out.println("arr[" + pos + "] = " + arr[pos]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println(ex.getMessage());
            } catch (NumberFormatException ex) {
                System.err.println("insert a number");
            }


        } while (!selection.equals("0"));

    }


}
