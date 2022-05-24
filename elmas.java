import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;



public class elmas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = Integer.parseInt(scanner.next());

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int counter1=0;
        for (int i = n-1; i >= 0 ; i--) {
            counter1 += 1;
            for (int j = 0; j < counter1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
