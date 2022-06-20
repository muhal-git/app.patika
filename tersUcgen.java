import java.util.*;

public class tersUcgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayisi >>  ");

        int basamak = Integer.parseInt(scanner.next());
        int dummy = basamak;
        for (int i = 0; i < dummy; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2*basamak-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
            basamak--;
        }
    }
}
